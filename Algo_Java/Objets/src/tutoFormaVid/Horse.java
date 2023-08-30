package tutoFormaVid;

public class Horse {
	protected String mName;
	protected int mPosX;
	protected int mPosY;
	
	public Horse(String name) {
		this.mName = name;
		this.mPosX = 50;
		this.mPosY = 50;
	}
	
	
	
	public void move(int x, int y) 
	{
		this.mPosX = x;
		this.mPosY = y;
	}
	
	public String getName() {
		return mName;
	}

}
