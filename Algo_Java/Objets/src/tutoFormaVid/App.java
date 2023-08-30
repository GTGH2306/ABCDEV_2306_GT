package tutoFormaVid;


public class App {

	/*
 	final peut �tre utilis� sur:
 	une classe, pour qu'elle ne puisse �tre �tendue.
 	une m�thode, pour qu'elle ne puisse �tre red�fini.
 	une variable, pour qu'elle ne puisse �tre modifi�e.
 	extends fais une classe fille
 	*/

	public static void main(String[] args) {
		Horse bibi = new Horse("Bibi");
		
		Pegasus manifico = new Pegasus("ElManifico");
		
		bibi.move(32, 46);
		manifico.move(25, 32);
		manifico.fly(23);
		
		if (manifico instanceof Pegasus) {
			System.out.println(manifico.getName() + " est un Pegase.");
		}
		
		Cottage c = new Cottage();
		Ship s = new Ship();
		
		c.fly("Gasole");
		s.moveXY(33, 55);
	}

}
