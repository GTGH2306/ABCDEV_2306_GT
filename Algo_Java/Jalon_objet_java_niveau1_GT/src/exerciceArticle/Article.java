package exerciceArticle;

public class Article {
	private String reference, designation;
	private double prixHT;
	private static double tauxTVA = 0;
	
	public Article() { //Constructeur par defaut
		reference = "NON ASSIGNE";
		designation = "NON ASSIGNE";
		prixHT = -1;
	}
	
	public Article(String _ref, String _des, double _prix) { //Constructeur avec paramêtres
		reference = _ref;
		designation = _des;
		prixHT = _prix;
	}
	
	public double calculerPrixTTC() { //retourne le prix TTC
		return Math.round((this.prixHT + (this.prixHT * tauxTVA/100)) * 100) / 100d;
	}
	
	public void afficherArticle() {
		System.out.println(
				"Designation :\t" + this.designation + "\n" +
				"Reference :\t" + this.reference + "\n" +
				"Prix HT :\t" + this.prixHT + "\n" +
				"Prix TTC:\t" + calculerPrixTTC() + "\t(TVA: " + tauxTVA + "%)"
				);
	}
	
	
	
	// GETTERS ET SETTERS
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public static double getTauxTVA() {
		return tauxTVA;
	}

	public static void setTauxTVA(double tauxTVA) {
		Article.tauxTVA = tauxTVA;
	}

}
