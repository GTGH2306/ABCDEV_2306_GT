package testCarte;

enum Figure {
	SEPT("Sept"),
	HUIT("Huit"),
	NEUF("Neuf"),
	DIX("Dix"),
	VALET("Valet"),
	DAME("Dame"),
	ROI("Roi"),
	AS("As");
	
	private String nom;
	
	private Figure(String _nom) {
		nom = _nom;
	}
	
	public String getNom() {
		return nom;
	}
	
}

enum Couleur {
	COEUR("Coeur"),
	CARREAU("Carreau"),
	PIQUE("Pique"),
	TREFLE("Trèfle");
	
	private String nom;
	
	private Couleur(String _nom) {
		nom = _nom;
	}

	public String getNom() {
		return nom;
	}
}

public class Carte {
	private Couleur couleur;
	private Figure figure;
	private boolean atout;
	private int valeur;
	
	public Carte(Couleur _couleur, Figure _figure) {
		couleur = _couleur;
		figure = _figure;
	}
	
	public String toString() {
		return (figure.getNom() + " de " + couleur.getNom() +  ".");
	}
}
