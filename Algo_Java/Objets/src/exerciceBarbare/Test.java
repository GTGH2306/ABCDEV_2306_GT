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
		
		hulk.addToInventory(new Weapon("Club", 14));
		hulk.addToInventory(new Shield(61));
		hulk.addToInventory(new Weapon("Spear", 11));

		System.out.println(hulk);
		
		Ranger ranger = new Ranger("Léon", new Weapon("Sword", 11), 130);
		System.out.println(ranger);
		
		ranger.learnNewSpell(4);
		System.out.println(ranger);
		ranger.learnNewSpell(2);
		System.out.println(ranger);
		
		ranger.fight(ranger);
		ranger.fight(olaf);
		hulk.fight(ranger);
	}

}
