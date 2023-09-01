package exerciceRecettes;

public class Ingredient {
	String nom_aliment, etat;
	int quantite;
	String unite;
	boolean cuit, decoupe;
	int tempCuisson;
	Ingredient(String n, String e, int q, String unite, int temp){
		this.nom_aliment = n;
		this.etat = e;
		this.quantite = q;
		this.unite = unite;
		this.cuit = false;
		this.decoupe = false;
		this.tempCuisson = temp;
	 }
	
	public boolean equals(Ingredient _test) {
		if (this.nom_aliment.equals(_test.nom_aliment) && this.etat.equals(_test.etat)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void cuire(int temp) {
		if (temp >= this.tempCuisson && !cuit) {
			cuit = true;
		}
	}
	
	public void decouper() {
		if (!decoupe) {
			decoupe = true;
		}
	}

}
