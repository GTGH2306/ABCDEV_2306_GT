package exerciceAquarium;

import java.util.ArrayList;

public class Poisson extends Entity {
	
	
	
	private Genre genre;
	private Race race;
	
	
	public Poisson(String _nom, Genre _genre, Race _race, int _age) {
		super(_nom);
		genre = _genre;
		race = _race;
		age = _age;
	}
	
	public String toString() {
		return ("Nom: " + this.getNom() + "\tGenre: " + this.genre.getNom() + "\tPV: " + this.pv);
	}
	
	public Genre getGenre() {
		return this.genre;
	}
	public Race getRace() {
		return this.race;
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
		this.age ++;
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
						System.out.println(this.getNom() + " à voulu manger " + this.getMaison().getPoissons().get(indexPoissonMordu).getNom() + " mais ils sont de la même race.");
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
		}
		
	}
	
	@Override
	public void seReproduire() {
		if (this.isAlive()) {
			
		}
		
	}
	
	
	
	
	
	//ENUMS
	
	public enum Genre{
		MALE("Mâle"),
		FEMELLE("Femelle");
		
		private String nom;
		
		private Genre(String _nom) {
			nom = _nom;
		}
		
		public String getNom(){
			return nom;
		}
	}
	
	public enum Race{
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
	}
}
