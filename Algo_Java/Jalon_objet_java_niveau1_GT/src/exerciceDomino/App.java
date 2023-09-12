package exerciceDomino;

public class App {

	public static void main(String[] args) {
		Domino basique = new Domino();
		Domino domA = new Domino(2, 5);
		Domino domB = new Domino(5, 4);
		
		basique.affichePoints();
		domA.affichePoints();
		domB.affichePoints();
		System.out.println(domA.valeur(domB));
		System.out.println(domA.estCompatible(domB));
		System.out.println(domA.estCompatible(basique));

	}

}
