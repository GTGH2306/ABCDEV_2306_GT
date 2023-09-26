package exercicePersonnages;

import java.util.ArrayList;
import java.util.Scanner;

public class Joueur {
	private String pseudo;
	private int[] dateNaissance;
	private ArrayList<Personnage> cartes;
	
	public Joueur() {
		Scanner sc = new Scanner(System.in);
		dateNaissance = new int[3];
		System.out.println("Saisissez Pseudo: ");
		pseudo = sc.nextLine();
		System.out.println("Saisissez jour de naissance: ");
		dateNaissance[0] = sc.nextInt();
		System.out.println("Saisissez mois de naissance: ");
		dateNaissance[1] = sc.nextInt();
		System.out.println("Saisissez année de naissance: ");
		dateNaissance[2] = sc.nextInt();
		
		cartes = new ArrayList<Personnage>();
		sc.close();
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
	

	public Personnage choisirCarte() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez une carte:\n");
		for (int i = 0; i < this.cartes.size(); i++) {
			System.out.println((i + 1) + ". " + cartes.get(i).getNom());
		}
		Personnage retour = cartes.get(sc.nextInt() - 1);
		sc.close();
		return retour;
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
	
}
