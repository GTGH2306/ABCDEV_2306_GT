package exempleVille;

public class Ville {
	public static int nbInstances = 0;
	protected String nomVille;
	protected String nomPays;
	protected int nbHabitant;
	
	public Ville()
	{
		nomVille = "inconnu";
		nomPays = "inconnu";
		nbHabitant = -1;
		nbInstances ++;
	}
	
	public Ville(String pNomVille, String pNomPays, int pNbHabitant) {
		nomVille = pNomVille;
		nomPays = pNomPays;
		nbHabitant = pNbHabitant;
		nbInstances ++;
	}
	
	public void decrisToi() {
		System.out.println("La ville de " + this.nomVille + " se situe en " + this.nomPays + " et a " + this.nbHabitant + " habitants.");
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
