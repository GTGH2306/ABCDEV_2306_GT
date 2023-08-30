package tutoPolymorphisme;

public class Glider extends Vehicle implements Flyable {

	public Glider() {
		this.moveSpeed = 28;
	}
	
	@Override
	public void moveXY(int x, int y) {
		System.out.println("Le planeur fend l'air vers " + x + ", " + y);
	}
	
	@Override
	public void fly(String energy) {
		System.out.println("Le planeur se propulse dans les airs avec du " + energy + ".");
	}
	
}
