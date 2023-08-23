package exempleVille;

public class Ville {
	private String nomVille;
	private String nomPays;
	private int nbHabitant;
	
	public Ville()
	{
		System.out.println("Création de ville avec paramêtres par défaut.");
		nomVille = "inconnu";
		nomPays = "inconnu";
		nbHabitant = -1;
	}
	
	public Ville(String pNomVille, String pNomPays, int pNbHabitant) {
		System.out.println("Création de ville avec paramêtres full pimpé.");
		nomVille = pNomVille;
		nomPays = pNomPays;
		nbHabitant = pNbHabitant;
	}
	
	public String getNomVille() {
		return nomVille;
	}
	
	public String getNomPays() {
		return nomPays;
	}
	
	public int getNbHabitant() {
		return nbHabitant;
	}
}
