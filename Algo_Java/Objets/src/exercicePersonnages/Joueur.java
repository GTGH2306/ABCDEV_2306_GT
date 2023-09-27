package exercicePersonnages;

import java.util.ArrayList;

public class Joueur {
	private String pseudo;
	private int[] dateNaissance;
	protected ArrayList<Personnage> cartes;
	private int pv;
	private int star;
	
	public Joueur() {
		dateNaissance = new int[3];
		System.out.println("Saisissez Pseudo: ");
		pseudo = Partie.sc.nextLine();
		System.out.println("Saisissez jour de naissance: ");
		dateNaissance[0] = Partie.sc.nextInt();
		System.out.println("Saisissez mois de naissance: ");
		dateNaissance[1] = Partie.sc.nextInt();
		System.out.println("Saisissez année de naissance: ");
		dateNaissance[2] = Partie.sc.nextInt();
		
		cartes = new ArrayList<Personnage>();
	}
	
	public Joueur(String _pseudo, int[] _dateNaissance) {
		this.pseudo = _pseudo;
		this.dateNaissance = _dateNaissance;
		cartes = new ArrayList<Personnage>();
	}
	
	public String toString() {
		String retour = "";
		retour += ("Pseudo: " + this.pseudo + "\n");
		retour += ("Date de naissance: " + this.dateNaissance[0] + "-" + this.dateNaissance[1] + "-" + this.dateNaissance[2]);
		return retour;
	}
	

	public Personnage jouerCarte() {
		boolean valide;
		int saisie;
		do {
			valide = true;
			System.out.println(this.pseudo + " choisissez une carte:\n");
			for (int i = 0; i < this.cartes.size(); i++) {
				System.out.println((i + 1) + ". " + cartes.get(i).getNom());
			}
			saisie = Partie.sc.nextInt();
			if (saisie > this.cartes.size() || saisie <= 0) {
				System.out.println("Saisie invalide.");
				valide = false;
			}
		} while (!valide);
		
		saisie --;
		Personnage retour = this.cartes.get(saisie);
		this.cartes.remove(saisie);
		return retour;
	}
	
	public int jouerStar() {
		int saisie;
		do {
			System.out.println("Saisissez le nombre d'étoiles que vous voulez jouer:\t(Vous en avez " + this.star + ")");
			saisie = Partie.sc.nextInt();
			if (saisie > this.getStar() || saisie < 0) {
				System.out.println("Saisie invalide.");
			}
		} while (saisie > this.getStar() || saisie < 0);
		this.star -= saisie;
		return saisie;
	}
	
	public void tirerCartes(int _nombre, ArrayList<Personnage> _jeu) {
		if (_nombre + cartes.size() <= _jeu.size()) {
			for (int i = 0; i < _nombre; i ++) {
				cartes.add(rdmCarte(_jeu));
			}
		} else {
			System.out.println(this.pseudo + " ne peux pas tirer autant de cartes.");
		}
	}
	
	public String mainDeCartes() {
		String retour = "";
		retour += ("--Main de " + this.pseudo + "--\n");
		for (int i = 0; i < this.cartes.size(); i++) {
			if (i < this.cartes.size() - 1) {
				retour += (this.cartes.get(i).getNom() + ", ");
			} else {
				retour += (this.cartes.get(i).getNom());
			}
		}
		return retour;
	}
	
	public Personnage rdmCarte(ArrayList<Personnage> _jeu) {
		boolean valide;
		int rdm;
		do {
			valide = true;
			rdm = (int)Math.floor(Math.random() * _jeu.size());
			for (int i = 0; i < cartes.size(); i++) {
				if (cartes.get(i).getNom().equals(_jeu.get(rdm).getNom())) {
					valide = false;
				}
			}
		} while (!valide);
		return _jeu.get(rdm);
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}
	
	public String getPseudo() {
		return this.pseudo;
	}
	
}
