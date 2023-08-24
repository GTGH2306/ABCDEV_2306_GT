package geometry;

public class TestCercle {

	public static void main(String[] args) {
		Point centre = new Point(5, 3);
		Point toto = new Point(2.45, 1.5);
		Cercle cercle = new Cercle(centre, 3);
		
		cercle.afficher();
		cercle.testAppartenance(toto);
	}

}
