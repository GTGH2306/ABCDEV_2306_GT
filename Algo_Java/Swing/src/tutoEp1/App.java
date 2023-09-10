package tutoEp1;

import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class App {

	public static void main(String[] args) throws Exception {
		//Met un style, avant la cr�ation de la fen�tre, sinon ce ne sera pas bon
		UIManager.setLookAndFeel(new NimbusLookAndFeel()); 
		
		MainWindow myWindow = new MainWindow(); //Cr�er un objet JFrame (une fen�tre)
		myWindow.setVisible(true); //Rend la fen�tre visible
		//La fen�tre doit �tre mis en visible qu'� la fin � moins d'utiliser myWindow.revalidate(); pour la reload	
	}

}
