package exerciceHierarchie2;

public class Animal {
	protected String espece;
	
	public Animal(String _espece) {
		espece = _espece;
	}
	
	public void manger() {
		System.out.println("Le " + this.espece + " mange.");
	}
	
	public void seDeplacer() {
		System.out.println("Le " + this.espece + " se déplace.");
	}
}
