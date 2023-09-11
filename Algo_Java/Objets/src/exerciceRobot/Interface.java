package exerciceRobot;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import exerciceRobot.Robot.Action;

public class Interface extends JFrame{
	
	private static final long serialVersionUID = -5487922602571353419L;
	private Robot linked;
	
	
	public Interface(Robot _robot) {
		super("Interface Robot"); //Utilise le constructeur JFrame, le String est l'en-tête de la fenêtre
		this.linked = _robot; //Lie un robot avec lequel l'interface fonctionnera
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Le programme ne continue pas en fond si on ferme la fenêtre
		this.setSize(300, 200); //Taille de la fenêtre
		this.setLocationRelativeTo(null); //Positionne au milieu par rapport au bureau
		JPanel contentPanel = new JPanel(); //ajoute un Panel, qui gère le placement des éléments
		getContentPane().add(contentPanel, BorderLayout.NORTH); //Aligne le panel sur le haut de la fenêtre
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); //Aligne les éléments au milieu du panel avec une marge de 10px
		
		JLabel lblPosX = new JLabel("Pos X :" + linked.getPosx()); //Element texte affichant la PosX
		contentPanel.add(lblPosX); //Ajoute le label au panel
		JLabel lblPosY = new JLabel("Pos Y :" + linked.getPosy()); //''PosY
		contentPanel.add(lblPosY);
		JLabel lblAngle = new JLabel("Angle : " + linked.getAngle() + "°");//''Angle
		contentPanel.add(lblAngle);
		
		JPanel panel = new JPanel(); //Créer un panel qui servira pour les Boutons
		getContentPane().add(panel, BorderLayout.CENTER); //Aligne le panel au centre
		
		JButton btnLeft = new JButton(" < "); //Bouton GAUCHE
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linked.action(Action.TOURNER_GAUCHE);
				lblAngle.setText("Angle : " + linked.getAngle() + "°");
			}
		});
		panel.add(btnLeft);
		
		JButton btnUp = new JButton(" ^ "); //Bouton AVANCER
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linked.action(Action.AVANCER);
				lblPosX.setText("Pos X :" + linked.getPosx());
				lblPosY.setText("Pos Y :" + linked.getPosy());
			}
		});
		panel.add(btnUp);
		
		JButton btnDown = new JButton(" v "); //Bouton RECULER
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linked.action(Action.RECULER);
				lblPosX.setText("Pos X :" + linked.getPosx());
				lblPosY.setText("Pos Y :" + linked.getPosy());
			}
		});
		panel.add(btnDown);
		
		JButton btnRight = new JButton(" > "); //Bouton DROITE
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linked.action(Action.TOURNER_DROITE);
				lblAngle.setText("Angle : " + linked.getAngle() + "°");
			}
		});
		panel.add(btnRight);
		
		JPanel panel_1 = new JPanel(); //Panel gérant les boutons d'action
		getContentPane().add(panel_1, BorderLayout.SOUTH); //Aligné en bas
		
		JButton btnAttaque = new JButton("ATTAQUER");
		btnAttaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linked.action(Action.ATTAQUER);
			}
		});
		panel_1.add(btnAttaque);
		
		JButton btnDetruire = new JButton("DETRUIRE");
		btnDetruire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linked.action(Action.DETRUIRE);
			}
		});
		panel_1.add(btnDetruire);
	}
}
