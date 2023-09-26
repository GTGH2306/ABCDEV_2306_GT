package exercicePersonnages;

import java.util.ArrayList;

public class Personnage {
	public static ArrayList<String> nomsUtilise = new ArrayList<String>();
	
	private String nom;
	private int puissance;
	private int defense;
	private String pouvoir;
	private Famille famille;
	
	public Personnage(String _nom, int _puissance, int _defense, String _pouvoir) throws Exception {
		if (persoValide(_nom,  _puissance, _defense)) {
			this.nom = _nom;
			this.puissance = _puissance;
			this.defense = _defense;
			this.pouvoir = _pouvoir;
			nomsUtilise.add(_nom);
			famille = Famille.getFamille(_puissance);
		}
	}
	
	public String toString() {
		String retour = "";
		retour += (this.famille + " (" + this.famille.getElement() + ")\t");
		retour += ("Nom: " + this.nom + "\t");
		retour += ("Pouvoir: " + this.pouvoir);
		
		return retour;
	}
	
	
	private static boolean persoValide(String _nom, int _puissance, int _defense) throws Exception {
		boolean retour = true;
		
		if (_puissance <= 2 || _defense <= 2 || (_puissance + _defense != 12)) {
			retour = false;
			throw new Exception("La puissance et la force doivent faire 12 et être supérieur à 2");
		}
		
		for (int i = 0; i < nomsUtilise.size(); i++) {
			if (_nom.equals(nomsUtilise.get(i))) {
				retour = false;
				throw new Exception("Le nom est déjà utilisé");
			}
		}
		return retour;
	}

	public int getPuissance() {
		return puissance;
	}

	public int getDefense() {
		return defense;
	}
	
	public String getNom() {
		return nom;
	}

}
