package tutoEp1;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainWindow extends JFrame{
	
	private static final long serialVersionUID = -7448244955755686414L;
	
	public MainWindow () {
		super("Ma Fen�tre");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Par defaut sur HIDE_ON_CLOSE
		this.setSize(450, 200); //Met une taille de 800px par 500px
		this.setLocationRelativeTo(null); //La fait appara�tre au milieu de l'�cran
		//Pour avoir une fen�tre bien centr�, il faut la centr� APRES avoir mis la taille
		//Sinon, elle centrera en ce basant sur une fen�tre de 0px,0px PUIS agrandira la fen�tre en bas et � droite
		 
		JPanel contentPane = (JPanel)this.getContentPane(); //JPanel permet de g�rer des contenu (boutons, textes, etc..)
		contentPane.setLayout(new FlowLayout());
		//Layout correspond � une strat�gie de placement des �l�ments
		//FlowLayout est une fa�on de gerer les �l�ments de fa�on dynamique
		contentPane.add(new JButton("Push Me!"));//Ajoute un bouton au JPanel
		contentPane.add(new JButton("Click Me! !\t! !\t!"));
		contentPane.add(new JCheckBox("Check me!")); //Checkbox
		contentPane.add(new JTextField(10)); //Par defaut tr�s court, on peux mettre un texte par defaut ou taille en int

	}
	
}
