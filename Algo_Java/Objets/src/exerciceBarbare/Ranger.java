package exerciceBarbare;

public class Ranger extends Creature {
	private Weapon weapon;
	private int spell;
	
	public Ranger(String _name, Weapon _weapon, int _health) {
		this.name = _name;
		this.weapon = _weapon;
		this.health = _health;
	}
	
	public String toString() {
		return (this.getClass().getSimpleName() + " " + this.name + " *" + this.health + "*, " + this.weapon + ", spell = " + this.spell);
	}
	
	public void learnNewSpell(int x) {
		if (x > this.spell) {
			this.spell = x;
		}
	}

	@Override
	public int attack() {
		return (this.weapon.getDamage() + this.spell);
	}

	@Override
	public int defense() {
		return this.health;
	}

}
