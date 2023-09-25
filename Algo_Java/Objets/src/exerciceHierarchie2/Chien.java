package exerciceHierarchie2;

public class Chien extends Animal {
	
	protected String nom;
	
	public Chien(String _espece, String _nom) {
		super(_espece);
		nom = _nom;
	}
	
	public void manger() {
		System.out.println("Le " + this.espece + " mange de la pâtée.");
	}
	
	public void seDeplacer() {
		System.out.println("Le " + this.espece + " ce déplace.");
	}
	
}
