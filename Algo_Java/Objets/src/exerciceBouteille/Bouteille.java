package exerciceBouteille;

public class Bouteille {
	private boolean ouverte;
	private double prct_plein;

	public Bouteille() {
		ouverte = false;
		prct_plein = 0;
	}
	
	public Bouteille(double p_prct_plein) {
		ouverte = false;
		prct_plein = p_prct_plein;
	}
	
	
	public void ouvrir() {
		
		if (!ouverte) {
			ouverte = true;
		} else {
			System.out.println("Vous ne pouvez pas ouvrir une bouteille déjà ouverte.");
		}
	}
	public void fermer() {
			
		if (ouverte) {
			ouverte = false;
		} else {
			System.out.println("Vous ne pouvez pas fermer une bouteille déjà fermée.");
		}
	}
	public void remplir(double p_remplir) {
		if (ouverte) {
			if (p_remplir + prct_plein <= 100) {
				prct_plein += p_remplir;
			} else {
				System.out.println("C'est plus que ce que la bouteille peut contenir.");
			}
		} else {
			System.out.println("Vous ne pouvez pas remplir une bouteille fermée.");
		}
	}
	public void remplirTout() {
		if (ouverte) {
			prct_plein = 100;
		} else {
			System.out.println(" Vous ne pouvez pas remplir une bouteille fermée.");
		}
	}
	public void vider(double p_vider) {
		if (ouverte) {
			if (prct_plein - p_vider >= 0) {
				prct_plein -= p_vider;
			} else {
				System.out.println("C'est plus que ce qu'il y'a dans la bouteille.");
			}
		} else {
			System.out.println("Vous ne pouvez pas vider une bouteille fermée.");
		}
	}
	public void viderTout() {
		if (ouverte) {
			prct_plein = 0;
		} else {
			System.out.println("Vous ne pouvez pas vider une bouteille fermée.");
		}
	}
	public double getPourcentagePlein() {
		return prct_plein;
	}
	public boolean getOuverte() {
		return ouverte;
	}
}
