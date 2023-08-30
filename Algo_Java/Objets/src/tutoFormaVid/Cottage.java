package tutoFormaVid;

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
		System.out.println("Je me propulse dans les airs avec du " + energy + ".");
	}
	
	@Override
	public void boost(int x) {
		System.out.println("Boost de " + x + ".");
	}

}
