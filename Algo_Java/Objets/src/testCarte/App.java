package testCarte;

public class App {

	public static void main(String[] args) {
		
		JeuDeBelote jeu = new JeuDeBelote();
		
		for (Carte e: jeu.getPaquet()) {
			System.out.println(e);
		}
		
	}

}
