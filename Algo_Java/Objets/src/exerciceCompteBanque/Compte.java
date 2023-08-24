package exerciceCompteBanque;

public class Compte {
	public double solde;
	
	public Compte(double _solde) {
		solde = _solde;
	}
	
	public void deposer(double _depot) {
		solde += _depot;
	}
	
	public void retirer(double _retrait) {
		solde -= _retrait;
	}
	
	public void afficher() {
		System.out.println(solde + " euros disponible sur le compte.");
	}

}
