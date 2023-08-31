package exerciceBarbare;

abstract public class Creature {
	protected String name;
	protected int health;
	
	public void fight(Creature _adversaire) {
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
	
	public String getName() {
		return this.name;
	}
	
	abstract public int attack();
	abstract public int defense();
	
	
}
