package exercicePoupeeRusse;

public class App {

	public static void main(String[] args) {
		PoupeeRusse p1 = new PoupeeRusse(1);
		PoupeeRusse p2 = new PoupeeRusse(2);
		PoupeeRusse p3 = new PoupeeRusse(3);
		
		p1.ouvrir();
		p1.placerDans(p2);
		p1.fermer();
		p1.placerDans(p2);
		p2.ouvrir();
		p1.placerDans(p2);
		p2.fermer();
		p1.sortirDe(p2);
		p2.ouvrir();
		p1.sortirDe(p2);
		p1.placerDans(p2);
		p2.fermer();
		p3.ouvrir();
		p2.placerDans(p3);
		p3.fermer();
	}

}
