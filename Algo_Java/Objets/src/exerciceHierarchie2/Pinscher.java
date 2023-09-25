package exerciceHierarchie2;

public class Pinscher extends Chien {
	
	public Pinscher(String _nom) {
		super("Pinscher", _nom);
	}
	
	public void seDeplacer() {
		super.seDeplacer();
		System.out.println("Ouaf !");
	}
}
