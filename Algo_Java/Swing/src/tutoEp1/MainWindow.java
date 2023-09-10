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
		super("Ma Fenêtre");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Par defaut sur HIDE_ON_CLOSE
		this.setSize(450, 200); //Met une taille de 800px par 500px
		this.setLocationRelativeTo(null); //La fait apparaître au milieu de l'écran
		//Pour avoir une fenêtre bien centré, il faut la centré APRES avoir mis la taille
		//Sinon, elle centrera en ce basant sur une fenêtre de 0px,0px PUIS agrandira la fenêtre en bas et à droite
		 
		JPanel contentPane = (JPanel)this.getContentPane(); //JPanel permet de gèrer des contenu (boutons, textes, etc..)
		contentPane.setLayout(new FlowLayout());
		//Layout correspond à une stratégie de placement des éléments
		//FlowLayout est une façon de gerer les éléments de façon dynamique
		contentPane.add(new JButton("Push Me!"));//Ajoute un bouton au JPanel
		contentPane.add(new JButton("Click Me! !\t! !\t!"));
		contentPane.add(new JCheckBox("Check me!")); //Checkbox
		contentPane.add(new JTextField(10)); //Par defaut très court, on peux mettre un texte par defaut ou taille en int

	}
	
}
