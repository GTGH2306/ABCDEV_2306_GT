package geometry;

public class Cercle {
	Point centre;
	double rayon;
	
	public Cercle() {
		centre = new Point();
		rayon = 0;
	}
	
	public Cercle(Point _point, double _ray){
		centre = _point;
		rayon = _ray;
	}
	
	public double perimetre(){
		return (2d * Math.PI * rayon);
	}
	public double surface() {
		return (Math.PI * Math.pow(rayon, 2));
	}
	public void testAppartenance(Point _point) {
		double dx = _point.abscisse - centre.abscisse;
		double dy = _point.ordonnee - centre.ordonnee;
		double distance = Math.sqrt(dx * dx + dy * dy);
		if (distance <= rayon) {
			System.out.println("Le point testé est dans le cercle.\t(Distance: " + Math.round(distance * 100) / 100d + ")");
		} else {
			System.out.println("Le point testé n'est pas dans le cercle.\t(Distance: " + Math.round(distance * 100) / 100d + ")");
		}
	}
	public void afficher() {
		System.out.println("Pour le cercle en: " + centre.abscisse + ", " + centre.ordonnee + " de rayon " + rayon + " les résultats sont:");
		System.out.println("Le périmètre est de: " + Math.round(perimetre() * 100) / 100d + "\nLa surface est de: " + Math.round(surface() * 100) / 100d);
	}

}
