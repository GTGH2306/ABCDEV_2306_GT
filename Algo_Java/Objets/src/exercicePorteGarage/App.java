package exercicePorteGarage;

public class App {

	public static void main(String[] args) {
		PorteDeGarage porte1 = new PorteDeGarage(true, 0);
		PorteDeGarage porte2 = new PorteDeGarage(false, 0);
		PorteDeGarage porte3 = new PorteDeGarage(false, 50);
		PorteDeGarage porte4 = new PorteDeGarage(false, 100);
		
		boolean test1 = porte2.verouillerPorte();
		boolean test2 = porte3.verouillerPorte();
		boolean test3 = porte2.deverouillerPorte();
		boolean test4 = porte2.ouvrirPartiellement(85);
		boolean test5 = porte2.ouvrirPartiellement(135);
	}

}
