package tutoFormaVid;

public final class Pegasus extends Horse {
	
	private int mPosZ;

	public Pegasus(String name) {
		super(name);
		this.mPosZ = 100;
	}
	
	public void move(int x, int y) {
		super.move(x,  y);
		System.out.println("Le P�gase se d�place (X = " + this.mPosX + ", Y = " + this.mPosY + ")");
	}
	
	public void fly(int z) {
		this.mPosZ = z;
		System.out.println("Le P�gase vole ( Z = " + this.mPosZ + ")");
	}

}