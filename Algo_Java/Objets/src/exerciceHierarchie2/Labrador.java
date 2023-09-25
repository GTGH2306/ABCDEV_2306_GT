package exerciceHierarchie2;

public class Labrador extends Chien {
	
	public Labrador(String _nom) {
		super("Labrador", _nom);
	}
	
	public void seDeplacer() {
		
		int rdm = (int)Math.floor(Math.random() * 2 + 1); 
		if (rdm == 1) {
			System.out.println("Le " + this.espece + " ce déplace.");
		} else {
			System.out.println("Le " + this.espece + " refuse de ce déplacer.");
		}
	}
}
