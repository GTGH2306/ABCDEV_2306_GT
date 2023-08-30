package tutoFormaVid;

public class Ship extends Vehicle {
	
	public Ship() {
		this.moveSpeed = 16;
	}
	
	@Override
	public void moveXY(int x, int y) {
		System.out.println("Le navire brasse les flots et se deplace en " + x + ", " + y);
	}

}
