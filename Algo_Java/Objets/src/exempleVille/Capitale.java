package exempleVille;

public class Capitale extends Ville{
	private String monument;
	
	public Capitale() {
		super();
		monument = "aucun";
	}
	
	public Capitale(String pNomVille, String pNomPays, int pNbHabitant, String _monument) {
		super(pNomVille, pNomPays, pNbHabitant);
		monument = _monument;
	}
	
	public void decrisToi() {
		System.out.println("La ville de " + this.nomVille + " se situe en " + this.nomPays + " et a " + this.nbHabitant + " habitants et son monument est " + this.monument +".");
	}
}
