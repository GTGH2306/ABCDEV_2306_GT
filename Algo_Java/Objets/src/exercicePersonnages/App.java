package exercicePersonnages;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) throws Exception {
		ArrayList<Personnage> listeCartes = new ArrayList<Personnage>();
		listeCartes.add(new Personnage("Ricko", 6, 6, "Manger une pomme"));
		listeCartes.add(new Personnage("Mike", 5, 7, "Cuire un oeuf"));
		listeCartes.add(new Personnage("Mario", 7, 5, "Réparer sa voiture"));
		listeCartes.add(new Personnage("Zeldu", 4, 8, "Chercher son Arc"));
		listeCartes.add(new Personnage("Chief", 8, 4, "Eplucher une patate"));
		listeCartes.add(new Personnage("Snake", 3, 9, "Parler aux serpents"));
		listeCartes.add(new Personnage("Freeman", 9, 3, "Ecrire une nouvelle loi"));
		listeCartes.add(new Personnage("Bellic", 6, 6, "Chercher un ami"));
		listeCartes.add(new Personnage("Drake", 7, 5, "Boire un verre d'eau"));
		listeCartes.add(new Personnage("Peach", 8, 4, "Lire la doc SQL"));

		
		for (Personnage e : listeCartes) {
			System.out.println(e);
		}
	}

}
