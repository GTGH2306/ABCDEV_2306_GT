package exerciceBarbare;

public class Shield {
	private int defense;
	
	public Shield(int _defense) {
		defense = _defense;
	}
	
	public String toString() {
		return ("Shield (" + defense + ")");
	}
	
	public int getDefense() {
		return defense;
	}

}
