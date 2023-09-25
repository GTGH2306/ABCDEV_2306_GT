package exerciceHierarchie2;

public class Herbivore extends Animal {
	
	public Herbivore(String _espece) {
		super(_espece);
	}
	
	public void manger() {
		System.out.println("Le " + this.espece + " mange des végétaux.");
	}
}
