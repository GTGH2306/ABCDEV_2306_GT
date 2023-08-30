package tutoHeritage;


public class App {

	public static void main(String[] args) {
		Apple a = new Apple();
		Pineapple p = new Pineapple();
		
		a.taste();
		p.taste();
		
		if(!(a instanceof PeelFruit)) { //instanceof détecte si il a x interfaces
			System.out.println("Ce fruit n'implemente pas PeelFruit");
		} else {
			System.out.println("Ce fruit implemente PeelFruit");
		}

		
	}

}
