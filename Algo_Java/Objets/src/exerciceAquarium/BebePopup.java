package exerciceAquarium;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BebePopup extends JFrame {
	
	public BebePopup(Aquarium _aquarium){
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Par defaut sur HIDE_ON_CLOSE
		this.setSize(500, 220); //Met une taille de 800px par 500px
		this.setLocationRelativeTo(null); //La fait appara�tre au milieu de l'�cran
		//Pour avoir une fen�tre bien centr�, il faut la centr� APRES avoir mis la taille
		//Sinon, elle centrera en ce basant sur une fen�tre de 0px,0px PUIS agrandira la fen�tre en bas et � droite
		JFrame parent = new JFrame();
		JPanel panel = new JPanel();
		String userInput = JOptionPane.showInputDialog("Veuillez saisir un texte :");
	}
}
