package exerciceVoiture;

public class Voiture {
	public String marque;
	public double prix;
	
	public Voiture() {
		marque = "BatMobile";
		prix = -1;
	}
	public Voiture(String _marque, double _prix) {
		marque = _marque;
		prix = _prix;
	}
	
	public void afficher() {
		System.out.println("La voiture est de marque " + marque + " et a une valeur de " + prix + " euros.");
	}
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String _new_marque) {
		marque = _new_marque;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double _new_prix) {
		prix = _new_prix;
	}
	

}
