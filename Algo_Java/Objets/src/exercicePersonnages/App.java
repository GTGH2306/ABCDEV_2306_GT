package exercicePersonnages;

public class App {

	public static void main(String[] args) throws Exception {
		JeuDeCarte jeu = new JeuDeCarte();
		Joueur j1 = new Joueur("Gluten", new int[] {27, 06, 1997});
		IA ia = new IA("Toto");
		
		j1.tirerCartes(5, jeu.getJeu());
		ia.tirerCartes(5, jeu.getJeu());
		
		for (Personnage e : jeu.getJeu()) {
			System.out.println(e);
		}
		
		System.out.println(j1);
		System.out.println(ia);

		System.out.println(j1.mainDeCartes());
		System.out.println(ia.mainDeCartes());
		
		Partie game = new Partie(j1, ia);
		game.jouer();
		
	}

}
