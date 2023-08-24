package exercicePorteGarage;

public class PorteDeGarage {
	private boolean est_verouille;
	private double prct_ouverture;
	
	public PorteDeGarage() {
		est_verouille = true;
		prct_ouverture  = 0;
	}
	
	public PorteDeGarage(boolean _verouille, double _ouverture) {
		est_verouille = _verouille;
		prct_ouverture  = _ouverture;
	}
	
	public boolean fermerEntierement() {
		if (prct_ouverture < 100) {
			prct_ouverture = 100;
			return true;
		} else {
			return false;
		}
	}
	public boolean ouvrirEntierement() {
		if (prct_ouverture > 0 && !est_verouille) {
			prct_ouverture = 0;
			return true;
		} else {
			return false;
		}
	}
	public boolean verouillerPorte() {
		if (!est_verouille && prct_ouverture == 0) {
			est_verouille = true;
			return true;
		} else {
			return false;
		}
	}
	public boolean deverouillerPorte() {
		if (est_verouille) {
			est_verouille = false;
			return true;
		} else {
			return false;
		}
	}
	public boolean ouvrirPartiellement(double _prct_ouverture) {
		if (_prct_ouverture >= 0 && _prct_ouverture <= 100 && !est_verouille) {
			prct_ouverture = _prct_ouverture;
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean getEstVerouille() {
		return est_verouille;
	}
	
	public double getPrctOuverture() {
		return prct_ouverture;
	}
}
