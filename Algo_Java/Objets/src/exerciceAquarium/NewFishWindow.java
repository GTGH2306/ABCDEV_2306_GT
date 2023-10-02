package exerciceAquarium;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import exerciceAquarium.Poisson.Genre;
import exerciceAquarium.Poisson.Race;

public class NewFishWindow extends JFrame{

	private static final long serialVersionUID = 6598524712479232491L;
	private JTextField textField;
	private String nomPoisson;
	private Genre genrePoisson;
	private Race especePoisson;
	private int agePoisson;
	
	public NewFishWindow(Aquarium _aquarium, MainWindow _main) {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Par defaut sur HIDE_ON_CLOSE
		this.setSize(380, 253); //Met une taille de 800px par 500px
		this.setLocationRelativeTo(null); //La fait apparaître au milieu de l'écran
		getContentPane().setLayout(null);
		
		
		
		textField = new JTextField();
		textField.setBounds(10, 36, 200, 30);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Saisissez nom du Poisson:");
		lblNewLabel.setBounds(10, 11, 200, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Esp\u00E8ce:");
		lblNewLabel_1.setBounds(10, 77, 200, 14);
		getContentPane().add(lblNewLabel_1);
		
		
		String[] races = new String[Race.values().length];
		for (int i = 0; i < races.length; i++) {
			races[i] = Race.values()[i].getNom();
		}
		JComboBox comboBox = new JComboBox(races);
		comboBox.setSelectedIndex(0);
		comboBox.setMaximumRowCount(races.length);
		comboBox.setBounds(10, 102, 200, 30);
		getContentPane().add(comboBox);
		
		String[] ages = new String[19];
		for (int i = 0; i < ages.length; i++) {
			ages[i] = Integer.toString(i);
		}
		JComboBox comboAge = new JComboBox(ages);
		comboAge.setLocation(10, 168);
		comboAge.setSize(60, 30);
		comboAge.setSelectedIndex(0);
		comboAge.setMaximumRowCount(ages.length);
		getContentPane().add(comboAge);
		
		
		
		JRadioButton maleButton = new JRadioButton("Mâle");
		maleButton.setBounds(260, 36, 109, 23);
		maleButton.setSelected(true);
		getContentPane().add(maleButton);
		
		JRadioButton femaleButton = new JRadioButton("Femelle");
		femaleButton.setBounds(260, 62, 109, 23);
		getContentPane().add(femaleButton);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(maleButton);
		buttonGroup.add(femaleButton);
		
		JLabel lblNewLabel_2 = new JLabel("Âge:");
		lblNewLabel_2.setBounds(10, 143, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomPoisson = textField.getText();
				if (femaleButton.isSelected()) {
					genrePoisson = Genre.FEMELLE;
				} else {
					genrePoisson = Genre.MALE;
				}
				especePoisson = Race.stringToRace(comboBox.getSelectedItem().toString());
				agePoisson = Integer.valueOf(comboAge.getSelectedItem().toString());
				Poisson bebe = new Poisson(nomPoisson, genrePoisson, especePoisson, agePoisson, _aquarium.getTour());
				bebe.setMaison(_aquarium);
				_aquarium.getPoissons().add(bebe);
				_main.refresh();
				dispose();
			}
		});
		btnNewButton.setBounds(260, 168, 89, 30);
		getContentPane().add(btnNewButton);
		
		
		
		
		
	}
}
