package exerciceBarbare;

public class Weapon implements HandItem {
	private String name;
	private int damage;
	
	public Weapon(String _nom, int _dmg) {
		name = _nom;
		damage = _dmg;
	}
	
	public String toString() {
		return (this.name + " (" + damage + ")") ;
	}
	
	@Override
	public int getDamage() {
		return damage;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getDefense() {
		return -1;
	}
}
