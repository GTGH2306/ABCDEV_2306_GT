package exerciceBarbare;

public class Barbarian {
	private String name;
	private int health;
	private Weapon leftHand;
	private Weapon rightHand;
	
	public Barbarian(String _name, int _health, Weapon _leftHand, Weapon _rightHand) {
		name = _name;
		health = _health;
		leftHand = _leftHand;
		rightHand = _rightHand;
	}
	
	public String toString() {
		return (this.getClass().getSimpleName() + " " +name + " *" + health + "*, L : " + leftHand + ", R : " + rightHand);
	}
	
	public String getName() {
		return name;
	}
	
	public int attack() {
		if (leftHand.getName().equals(rightHand.getName())) {
			return (leftHand.getDamage() + rightHand.getDamage() + 2);
		} else {
			return (leftHand.getDamage() + rightHand.getDamage());
		}
	}
	
	public int defense() {
		return health;
	}
	
	public void fight(Barbarian _adversaire) {
		int pvA = this.defense();
		int pvB = _adversaire.defense();
		String winner;
		
		do {
			pvA -= _adversaire.attack();
			pvB -= this.attack();
		} while (pvA > 0 && pvB > 0);
		
		if (pvA <= 0 && pvB <= 0) {
			winner = "nobody";
		} else if (pvA > pvB) {
			winner = this.getName();
		} else {
			winner = _adversaire.getName();
		}
		
		System.out.println(winner + " won the fight !");
		
	}
}
