package testCarte;

import java.util.ArrayList;

public class JeuDeBelote {
	
	private ArrayList<Carte> paquet;
	
	public JeuDeBelote() {
		paquet = new ArrayList<Carte>();
		for (int i = 0; i < Couleur.values().length; i ++) {
			for (int j = 0; j < Figure.values().length; j++) {
				paquet.add(new Carte (Couleur.values()[i], Figure.values()[j]));
			}
		}
	}
	
	public ArrayList<Carte> getPaquet(){
		return this.paquet;
	}

}
