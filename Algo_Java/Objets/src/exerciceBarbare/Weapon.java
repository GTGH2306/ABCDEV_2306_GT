package exerciceBarbare;

public class Weapon {
	private String name;
	private int damage;
	
	public Weapon(String _nom, int _dmg) {
		name = _nom;
		damage = _dmg;
	}
	
	public String toString() {
		return (name + " (" + damage + ")") ;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public String getName() {
		return name;
	}
}
