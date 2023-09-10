package tutoEp1;

import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class App {

	public static void main(String[] args) throws Exception {
		//Met un style, avant la création de la fenêtre, sinon ce ne sera pas bon
		UIManager.setLookAndFeel(new NimbusLookAndFeel()); 
		
		MainWindow myWindow = new MainWindow(); //Créer un objet JFrame (une fenêtre)
		myWindow.setVisible(true); //Rend la fenêtre visible
		//La fenêtre doit être mis en visible qu'à la fin à moins d'utiliser myWindow.revalidate(); pour la reload	
	}

}
