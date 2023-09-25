package exerciceHierarchie2;

public class Girafe extends Herbivore {
	public Girafe() {
		super("Girafe");
	}
	
	public void seDeplacer() {
		System.out.println("La " + this.espece + " se déplace doucement.");
	}
	
	public void meugler() {
		System.out.println("La " + this.espece + " meugle.");
	}

}
