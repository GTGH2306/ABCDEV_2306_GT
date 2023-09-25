package exerciceHierarchie2;

public class Cheval extends Herbivore{
	
	public Cheval() {
		super("Cheval");
	}
	
	public void hennir() {
		System.out.println("Le " + this.espece + " hennit.");
	}
	
	public void manger() {
		System.out.println("Le " + this.espece + " mange de l'herbe et du foin.");
	}

}
