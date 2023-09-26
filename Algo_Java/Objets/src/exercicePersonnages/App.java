package exercicePersonnages;

public class App {

	public static void main(String[] args) throws Exception {
		JeuDeCarte jeu = new JeuDeCarte();
		Joueur j1 = new Joueur();
		Joueur ia = new Joueur("Toto", new int[] {1, 1, 2000});
		
		j1.tirerCartes(5, jeu.getJeu());
		ia.tirerCartes(5, jeu.getJeu());
		
		for (Personnage e : jeu.getJeu()) {
			System.out.println(e);
		}
		
		System.out.println(j1);
		System.out.println(ia);

		System.out.println(j1.mainDeCartes());
		System.out.println(ia.mainDeCartes());
	}

}
