package exercicePersonnages;

import java.util.ArrayList;

public class JeuDeCarte {
	private ArrayList<Personnage> jeu;

	public JeuDeCarte() throws Exception {
		jeu = new ArrayList<Personnage>();
		this.jeu.add(new Personnage("Ricko", 6, 6, "Manger une pomme"));
		this.jeu.add(new Personnage("Mike", 5, 7, "Cuire un oeuf"));
		this.jeu.add(new Personnage("Mario", 7, 5, "Réparer sa voiture"));
		this.jeu.add(new Personnage("Zeldu", 4, 8, "Chercher son Arc"));
		this.jeu.add(new Personnage("Chief", 8, 4, "Eplucher une patate"));
		this.jeu.add(new Personnage("Snake", 3, 9, "Parler aux serpents"));
		this.jeu.add(new Personnage("Freeman", 9, 3, "Ecrire une nouvelle loi"));
		this.jeu.add(new Personnage("Bellic", 6, 6, "Chercher un ami"));
		this.jeu.add(new Personnage("Drake", 7, 5, "Boire un verre d'eau"));
		this.jeu.add(new Personnage("Peach", 8, 4, "Lire la doc SQL"));
	}
	
	public ArrayList<Personnage> getJeu(){
		return this.jeu;
	}
}
