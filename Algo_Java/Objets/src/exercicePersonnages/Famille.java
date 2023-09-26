package exercicePersonnages;

public enum Famille {
	CORSAIRE("Corsaire", "Eau"),
	GARDIEN("Gardien", "Terre"),
	MAGE("Mage", "Feu"),
	PALADIN("Paladin", "Terre"),
	SAGE("Sage", "Air");
	
	private String famille;
	private String element;
	
	Famille(String _famille, String _element){
		this.famille = _famille;
		this.element = _element;
	}
	
	public String getElement(){
		return this.element;
	}
	
	public String toString() {
		return this.famille;
	}
	
	public static Famille getFamille(int _puissance) {
		Famille retour;
		if (_puissance < 5) {
			retour = Famille.GARDIEN;
		} else if (_puissance == 5) {
			retour = Famille.SAGE;
		} else if (_puissance == 6) {
			retour = Famille.PALADIN;
		} else if (_puissance == 7) {
			retour = Famille.CORSAIRE;
		} else {
			retour = Famille.MAGE;
		}
		return retour;
	}
}
