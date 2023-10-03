package exerciceAquarium;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Poisson extends Entity {
	
	
	
	private Genre genre;
	private SousGenre sousGenre;
	private Race race;
	private boolean reproduced;
	private int tourNaissance;
	
	
	public Poisson(String _nom,Genre _genre , Race _race, int _age, int _naissance) {
		super(_nom);
		race = _race;
		age = _age;
		sousGenre = SousGenre.getSousGenre(this);
		genre = _genre;
		tourNaissance = _naissance;
	}
	
	
	public Poisson(String _nom, Race _race, int _age, int _naissance) {
		super(_nom);
		race = _race;
		age = _age;
		sousGenre = SousGenre.getSousGenre(this);
		genre = Genre.getGenre(this);
		tourNaissance = _naissance;
	}
	
	public String toString() {
		return ("Nom: " + this.getNom() + "\tGenre: " + this.genre.getNom() + "\tPV: " + this.pv);
	}
	
	public Genre getGenre() {
		return this.genre;
	}
	public void setGenre(Genre _genre) {
		this.genre = _genre;
	}
	public Race getRace() {
		return this.race;
	}
	public SousGenre getSousGenre() {
		return this.sousGenre;
	}
	
	
	public void manger(Entity _bouffe) {
		if ((this.race.isCarnivore() && _bouffe instanceof Poisson && _bouffe.getPv() > 0) || (this.race.isCarnivore() == false && _bouffe instanceof Algue && _bouffe.getPv() > 0)) {
			if (_bouffe instanceof Poisson) {
				_bouffe.setPv(_bouffe.getPv() - 4);
				_bouffe.checkLife();
				this.pv += 5;
				if (_bouffe.getPv() > 0) {
					System.out.println(this.getNom() + " croque " + _bouffe.getNom());
				} else {
					System.out.println(this.getNom() + " mange et tue " + _bouffe.getNom());
				}
			} else {
				_bouffe.setPv(_bouffe.getPv() - 2);
				_bouffe.checkLife();
				this.pv += 3;
				if (_bouffe.getPv() > 0) {
					System.out.println(this.getNom() + " croque une " + _bouffe.getNom());
				} else {
					System.out.println(this.getNom() + " mange totalement une " + _bouffe.getNom());
				}
			}
		} else {
			System.out.println(this.getNom() + " ne peux pas manger " + _bouffe.getNom());
		}
	}
	
	@Override
	public void comportement() {
		int rdm;
		this.pv --;
		if (this.pv <= 0) {
			System.out.println(this.getNom() + " meurt de faim.");
			this.vivant = false;
		}
		
		if (!(this.getMaison().getTour() == this.tourNaissance)) {
			this.age ++;
		}
		
		if(age >= 20) {
			System.out.println(this.getNom() + " meurt de vieilesse.");
			this.vivant = false;
		}
		this.checkLife();
		if (this.getPv() <= 5 && this.isAlive()) {
			ArrayList<Integer> ciblesPossible = new ArrayList<Integer>();
			if (this.race.carnivore) {
				for (int i = 0; i < this.getMaison().getPoissons().size(); i++) {
					if ((this.getMaison().getPoissons().get(i).isAlive()) && !(this.equals(this.getMaison().getPoissons().get(i)))) {
						ciblesPossible.add(i);
					}
				}
				if(ciblesPossible.size() > 0) {
					rdm = (int) Math.floor(Math.random() * ciblesPossible.size());
					int indexPoissonMordu = ciblesPossible.get(rdm);
					if (this.getMaison().getPoissons().get(indexPoissonMordu).race.equals(this.race)) {
//						System.out.println(this.getNom() + " à voulu manger " + this.getMaison().getPoissons().get(indexPoissonMordu).getNom() + " mais ils sont de la même race.");
					} else {
						manger(this.getMaison().getPoissons().get(indexPoissonMordu));
					}
				}
			} else {
				for (int i = 0; i < this.getMaison().getAlgues().size(); i++) {
					if ((this.getMaison().getAlgues().get(i).isAlive())) {
						ciblesPossible.add(i);
					}
				}
				if(ciblesPossible.size() > 0) {
					rdm = (int) Math.floor(Math.random() * ciblesPossible.size());
					int indexAlgueMordu = ciblesPossible.get(rdm);
					manger(this.getMaison().getAlgues().get(indexAlgueMordu));
				}
			}
		} else {
			seReproduire();
		}
		MainWindow.myWindow.refresh();
	}
	
	@Override
	public void seReproduire() {
		ArrayList<Poisson> ciblesPossible = new ArrayList<Poisson>();
		boolean naissance = false;
		int rdm;
		
		SousGenre.hermaAgeCheck(this);
		
		if (this.isAlive() && !this.hasReproduced() && this.getPv() > 5) {
			if (this.getGenre().equals(Genre.MALE) || this.getGenre().equals(Genre.FEMELLE)) {
				for (int i = 0; i < this.getMaison().getPoissons().size(); i++) {
					if (!(this.getMaison().getPoissons().get(i).equals(this))) {
						ciblesPossible.add(this.getMaison().getPoissons().get(i));
					}
				}
				rdm = (int) Math.floor(Math.random() * ciblesPossible.size());
				if (ciblesPossible.size() > 0) {
					if (((ciblesPossible.get(rdm).getGenre().equals(Genre.FEMELLE) && this.getGenre().equals(Genre.MALE) ||
						ciblesPossible.get(rdm).getGenre().equals(Genre.MALE) && this.getGenre().equals(Genre.FEMELLE)) ||
						this.getSousGenre().equals(SousGenre.HERMAOPPO)) &&
						ciblesPossible.get(rdm).getRace().equals(this.getRace()) &&
						!ciblesPossible.get(rdm).hasReproduced() &&
						this.getMaison().getPoissons().size() < 25
						) {
						if (this.getSousGenre().equals(SousGenre.HERMAOPPO) && ciblesPossible.get(rdm).getGenre().equals(Genre.MALE) && this.getGenre().equals(Genre.MALE)) {
							this.setGenre(Genre.FEMELLE);
							System.out.println(this.getNom() + " devient une femelle pour pouvoir ce reproduire.");
						} else if ((this.getSousGenre().equals(SousGenre.HERMAOPPO) && ciblesPossible.get(rdm).getGenre().equals(Genre.FEMELLE)) && this.getGenre().equals(Genre.FEMELLE)) {
							this.setGenre(Genre.MALE);
							System.out.println(this.getNom() + " devient un mâle pour pouvoir ce reproduire.");
						}
						
						naissance = true;
						ciblesPossible.get(rdm).setReproduced(true);
						this.setReproduced(true);
						
						System.out.println(this.getNom() + " c'est reproduit avec " + ciblesPossible.get(rdm).getNom());
					} else {
	//					System.out.println(this.getNom() + " à tenté de ce reproduire avec " + ciblesPossible.get(rdm).getNom() + " sans succès.");
					}
				}
			}
		}
		if (naissance) {
			String userInput = "";
			userInput = JOptionPane.showInputDialog("Nouvelle naissance! (Espece: " + this.getRace().getNom() + ")\nSaisissez nom du Poisson: ");
			if (userInput == null) {
				userInput = "Sans nom";
			}
			if (userInput.equals("")) {
				userInput = "Sans nom";
			}
			Poisson bebe = new Poisson(userInput, this.race, 0, this.getMaison().getTour());
			bebe.setMaison(this.getMaison());
			bebe.setPv((int) Math.floor(Math.random() * (6 - 2 + 1) + 2));
			this.getMaison().getPoissons().add(bebe);
		}	
	}
	
	public boolean hasReproduced() {
		return this.reproduced;
	}
	
	public void setReproduced(boolean _reproduced) {
		this.reproduced = _reproduced;
	}
	
	
	
	
	//ENUMS
	
	public enum Genre {
		MALE("Mâle"),
		FEMELLE("Femelle");
		
		private String nom;
		
		private Genre(String _nom) {
			nom = _nom;
		}
		
		public String getNom(){
			return nom;
		}
		
		public static Genre getGenre(Poisson _poisson) {
			Genre retour;
			int rdm2 = (int) Math.floor(Math.random() * 2);
			if (rdm2 == 1 || _poisson.sousGenre.equals(SousGenre.HERMAAGE)) {
				retour = Genre.MALE;
			} else {
				retour = Genre.FEMELLE;
			}
			return retour;
		}
		
		
		
		
	}
	
	public enum SousGenre {
		MONOSEXUE,
		HERMAAGE,
		HERMAOPPO;
		
		public static SousGenre getSousGenre(Poisson _poisson) {
			SousGenre retour;
			if (_poisson.getRace().equals(Race.BAR) || _poisson.getRace().equals(Race.MEROU)) {
				retour = HERMAAGE;
			} else if (_poisson.getRace().equals(Race.SOLE) || _poisson.getRace().equals(Race.POISSONCLOWN)) {
				retour = HERMAOPPO;
			} else {
				retour = MONOSEXUE;
			}
			return retour;
		}
		
		
		
		public static void hermaAgeCheck(Poisson _poisson) {
			if (_poisson.getSousGenre().equals(HERMAAGE) && _poisson.getGenre().equals(Genre.MALE) && _poisson.getAge() >= 10) {
				_poisson.setGenre(Genre.FEMELLE);
				System.out.println(_poisson.getNom() + " a changé de genre avec l'âge.");
			}
		}
	}
	
	public enum Race {
		MEROU("Mérou", true),
		THON("Thon", true),
		POISSONCLOWN("Poisson-Clown", true),
		SOLE("Sole", false),
		BAR("Bar", false),
		CARPE("Carpe", false);
		
		private String nom;
		private boolean carnivore;
		
		private Race(String _nom, boolean _carnivore) {
			nom = _nom;
			carnivore = _carnivore;
		}

		public String getNom() {
			return nom;
		}

		public boolean isCarnivore() {
			return carnivore;
		}
		
		public static Race stringToRace(String _string) {
			Race retour;
			switch (_string) {
			case "Mérou":
				retour = MEROU;
				break;
			case "Thon":
				retour = THON;
				break;
			case "Poisson-Clown":
				retour = POISSONCLOWN;
				break;
			case "Sole":
				retour = SOLE;
				break;
			case "Bar":
				retour = BAR;
				break;
			case "Carpe":
				retour = CARPE;
				break;
			default:
				retour = null;
			}
			return retour;
		}
	}
}
