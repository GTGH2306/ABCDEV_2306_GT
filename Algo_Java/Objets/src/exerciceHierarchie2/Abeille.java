package exerciceHierarchie2;

public class Abeille extends Animal {
	
	
	public Abeille() {
		super("Abeille");
	}
	
	public void manger() {
		System.out.println("L' Abeille mange du nectar.");
	}
	
	public void seDeplacer() {
		System.out.println("L' Abeille vole.");
	}
	
	public void bourdonner() {
		int rdm = (int)Math.floor(Math.random() * 3 + 1); 
		
		switch(rdm) {
		case 1:
			System.out.println("L' Abeille bourdonne furieusement.");
			break;
		case 2:
			System.out.println("L' Abeille bourdonne avec malice.");
			break;
		case 3:
			System.out.println("L' Abeille bourdonne joyeusement.");
			break;
		}
	}
}
