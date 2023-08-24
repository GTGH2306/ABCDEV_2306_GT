package exerciceRectangle;

public class Rectangle {
	double longueur;
	double largeur;
	
	public Rectangle() {
		longueur = 0;
		largeur = 0;
	}
	public Rectangle(double _long, double _larg) {
		longueur = _long;
		largeur = _larg;
	}
	
	public double surface() {
		return longueur * largeur;
	}
	
	public double perimetre() {
		return ((longueur + largeur) * 2);
	}
	public void afficher() {
		System.out.println("La surface du rectangle de " + longueur + " par " + largeur + " est: " + surface() + "\nEt son périmètre est: " + perimetre());
	}

}
