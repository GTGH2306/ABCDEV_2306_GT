package exerciceBarbare;

public class Shield implements HandItem{
	private int defense;
	private String name;
	
	public Shield(int _defense) {
		this.defense = _defense;
		this.name = "Shield";
	}
	
	public String toString() {
		return ("Shield (" + defense + ")");
	}
	
	@Override
	public int getDefense() {
		return defense;
	}

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
