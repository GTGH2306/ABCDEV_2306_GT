package tutoPolymorphisme;

public class Cottage extends Building implements Flyable {

	public Cottage() {
		System.out.println("Parcelle en place");
	}
	
	@Override
	public void build(String material) {
		System.out.println("Construction du bâtiment en " + material);
	}

	@Override
	public void fly(String energy) {
		System.out.println("La chaumière se propulse dans les airs avec du " + energy + ".");
	}
	
}
