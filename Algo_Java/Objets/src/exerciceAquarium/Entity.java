package exerciceAquarium;

public abstract class Entity {
	
	protected Aquarium maison = null;
	protected String nom;
	
	public Entity(String _nom) {
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
	
	public abstract void comportement();
}
