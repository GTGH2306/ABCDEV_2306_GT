package exerciceAquarium;

public class Consommable {
	
	protected Aquarium maison = null;
	protected String nom;
	
	public Consommable(String _nom) {
		nom = _nom;
	}

	public String getNom(){
		return this.nom;
	}
	
	public Aquarium getMaison() {
		return this.maison;
	}
	
	public void setMaison(Aquarium _maison) {
		this.maison = _maison;
	}
}
