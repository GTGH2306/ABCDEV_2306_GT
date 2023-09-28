package exerciceAquarium;

public abstract class Entity {
	
	protected Aquarium maison = null;
	protected String nom;
	protected int pv;
	protected int age = 0;
	protected boolean vivant = true;
	
	public void meurt() {
		if (this instanceof Poisson) {
			this.getMaison().getPoissons().remove(this.getMaison().getPoissons().indexOf(this));
		} else if (this instanceof Algue) {
			this.getMaison().getAlgues().remove(this.getMaison().getAlgues().indexOf(this));
		}
	}
	
	protected void checkLife() {
		if (pv <= 0) {
			this.vivant = false;
		}
	}
	
	public boolean isAlive() {
		return this.vivant;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setPv(int _pv) {
		this.pv = _pv;
	}
	public int getPv() {
		return this.pv;
	}
	
	public Entity(String _nom) {
		nom = _nom;
		pv = 10;
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
	public abstract void seReproduire();
}
