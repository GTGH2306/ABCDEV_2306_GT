package exerciceAquarium;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BebePopup extends JFrame {
	
	public BebePopup(Aquarium _aquarium){
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Par defaut sur HIDE_ON_CLOSE
		this.setSize(500, 220); //Met une taille de 800px par 500px
		this.setLocationRelativeTo(null); //La fait apparaître au milieu de l'écran
		//Pour avoir une fenêtre bien centré, il faut la centré APRES avoir mis la taille
		//Sinon, elle centrera en ce basant sur une fenêtre de 0px,0px PUIS agrandira la fenêtre en bas et à droite
		JFrame parent = new JFrame();
		JPanel panel = new JPanel();
		String userInput = JOptionPane.showInputDialog("Veuillez saisir un texte :");
	}
}
