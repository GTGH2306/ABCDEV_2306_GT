package exerciceBouteilleBis;
import java.util.ArrayList;

public class Bouteille {
	private boolean ouverte;
	private double prct_plein;
	private ArrayList<String> liquides;
	private ArrayList<Double> prct;
	private ArrayList<Double> compo;

	public Bouteille() {
		ouverte = false;
		prct_plein = 0;
		tabClear();
	}
	
	public Bouteille(double p_prct_plein) {
		ouverte = false;
		prct_plein = p_prct_plein;
		tabClear();
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
	public void remplir(double p_remplir, String p_liquide) {
		if (ouverte) {
			if (p_remplir + prct_plein <= 100) {
				boolean present = false;
				
				prct_plein += p_remplir;
				p_liquide = p_liquide.toLowerCase();
				for (int i = 0; i < liquides.size(); i++) {
					if (p_liquide.equals(liquides.get(i))) {
						present = true;
						prct.set(i, prct.get(i) + p_remplir);
					}
				}
				if (!present) {
					liquides.add(p_liquide);
					prct.add(p_remplir);
				}
				compo.add((double) 0);
				for (int i = 0; i < compo.size(); i++) {
					compo.set(i, (prct.get(i) / prct_plein) * 100d);
				}
			} else {
				System.out.println("C'est plus que ce que la bouteille peut contenir.");
			}
		} else {
			System.out.println("Vous ne pouvez pas remplir une bouteille fermée.");
		}
	}
	public void remplirTout(String p_liquide) {
			remplir(100d - prct_plein, p_liquide);
	}
	
	public void vider(double p_vider) {
		if (ouverte) {
			if (prct_plein - p_vider >= 0) {
				prct_plein -= p_vider;
				for (int i = 0; i < compo.size(); i++) {
					prct.set(i, prct.get(i) - (p_vider / 100d) * compo.get(i));
				}
			} else {
				System.out.println("C'est plus que ce qu'il y'a dans la bouteille.");
			}
			if (prct_plein == 0) {
				tabClear();
			}
		} else {
			System.out.println("Vous ne pouvez pas vider une bouteille fermée.");
		}
	}
	public void viderTout() {
		if (ouverte) {
			prct_plein = 0;
			tabClear();
		} else {
			System.out.println("Vous ne pouvez pas vider une bouteille fermée.");
		}
	}
	
	public void tabClear() {
		liquides = new ArrayList<String>();
		prct = new ArrayList<Double>();
		compo = new ArrayList<Double>();
	}
	
	public void afficher() {
		if(ouverte) {
			System.out.println("La bouteille est ouverte.");
		} else {
			System.out.println("La bouteille est fermée.");
		}
		System.out.println("La bouteille est pleine à " + prct_plein + " %");
		for (int i = 0; i < liquides.size(); i++) {
			System.out.println(liquides.get(i) + " " + prct.get(i) + " % (" + compo.get(i) + "% du liquide).");
		}
	}
	
	public double getPourcentagePlein() {
		return prct_plein;
	}
	public boolean getOuverte() {
		return ouverte;
	}
}
