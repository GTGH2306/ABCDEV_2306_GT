package exerciceBarbare;

public class Test {

	public static void main(String[] args) {
		
		Weapon sword = new Weapon("Excalibur", 50);
		System.out.println(sword);
		
		Barbarian hulk = new Barbarian("Hulk", 100, new Weapon("Dagger", 8), new Weapon("Axe", 12));
		System.out.println(hulk);
		
		Barbarian olaf = new Barbarian("Olaf", 80, new Shield(30), new Weapon("Pique", 15));
		System.out.println(olaf.attack());
		Barbarian zorg = new Barbarian("Zorg", 75, new Weapon("Sword", 9), new Weapon("Sword", 9));
		System.out.println(zorg.attack());
		
		hulk.fight(olaf);
		olaf.fight(zorg);
		
		System.out.println(new Shield(50));
	}

}
