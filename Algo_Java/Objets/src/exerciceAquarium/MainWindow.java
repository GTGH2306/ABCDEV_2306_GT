package exerciceAquarium;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainWindow extends JFrame{
	
	private static final long serialVersionUID = -756266984897988859L;
	private JTable table;
	private JLabel labelAlgues;
	private JScrollPane scrollPane;
	private Aquarium aquarium;
	private JPanel panel_3;
	private String[] columnNames = {"Nom", "Race", "Genre", "PV", "Âge"};
	private JLabel lblNewLabel;
	public static MainWindow myWindow = new MainWindow(new Aquarium(4));
	
	public MainWindow(Aquarium _aquarium){
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Par defaut sur HIDE_ON_CLOSE
		this.setSize(500, 583); //Met une taille de 800px par 500px
		this.setLocationRelativeTo(null); //La fait apparaître au milieu de l'écran
		//Pour avoir une fenêtre bien centré, il faut la centré APRES avoir mis la taille
		//Sinon, elle centrera en ce basant sur une fenêtre de 0px,0px PUIS agrandira la fenêtre en bas et à droite
		
		
		aquarium = _aquarium;
		lblNewLabel = new JLabel("---- TOUR: " + aquarium.getTour() + " ----");
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		
		
		
		String[][] tableau = new String[_aquarium.getPoissons().size()][5];
		for (int i = 0; i < _aquarium.getPoissons().size(); i++) {
			tableau[i][0] = _aquarium.getPoissons().get(i).getNom();
			tableau[i][1] = _aquarium.getPoissons().get(i).getRace().getNom();
			tableau[i][2] = _aquarium.getPoissons().get(i).getGenre().getNom();
			tableau[i][3] = Integer.toString(_aquarium.getPoissons().get(i).getPv());
			tableau[i][4] = Integer.toString(_aquarium.getPoissons().get(i).getAge());
		}
		panel_1.setLayout(new BorderLayout(0, 0));
		
		panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aquarium.getAlgues().remove(aquarium.getAlgues().size() - 1);
				refresh();
			}
		});
		panel_3.add(button_1);
		labelAlgues = new JLabel("Algue(s): " + _aquarium.getAlgues().size());
		panel_3.add(labelAlgues);
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aquarium.getAlgues().add(new Algue(0, 10, aquarium));
				refresh();
			}
		});
		panel_3.add(button);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.CENTER);
		
		table = new JTable(tableau, columnNames);
		table.setRowSelectionAllowed(false);
		scrollPane = new JScrollPane(table);
		panel_4.add(scrollPane);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Avancer Tour");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_aquarium.tour();
				refresh();
			}
		});
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewFishWindow popup = new NewFishWindow(_aquarium, myWindow);
				popup.setVisible(true);
			}
		});
		panel_2.add(btnNewButton_1);
		//Layout correspond à une stratégie de placement des éléments
		//FlowLayout est une façon de gerer les éléments de façon dynamique
		
	}
	
	public void refresh() {
		String[][] tableau = new String[aquarium.getPoissons().size()][5];
		for (int i = 0; i < aquarium.getPoissons().size(); i++) {
			tableau[i][0] = aquarium.getPoissons().get(i).getNom();
			tableau[i][1] = aquarium.getPoissons().get(i).getRace().getNom();
			tableau[i][2] = aquarium.getPoissons().get(i).getGenre().getNom();
			tableau[i][3] = Integer.toString(aquarium.getPoissons().get(i).getPv());
			tableau[i][4] = Integer.toString(aquarium.getPoissons().get(i).getAge());

		}
		table = new JTable(tableau, columnNames);
		scrollPane.setViewportView(table);
		
		panel_3.remove(labelAlgues);
		labelAlgues = new JLabel("Algue(s): " + aquarium.getAlgues().size());
		panel_3.add(labelAlgues, 1);
		
		/*
		for (JLabel element: listeLabels) {
			list.add(element);
		}
		*/
		lblNewLabel.setText("---- TOUR: " + aquarium.getTour() + " ----");
		revalidate();
	}

}
