package exerciceMontres;

public class Personne {
	private String nom;
	private boolean porteMontre;
	private Montre montre;
	private final static Montre EMPTY = new Montre(-1, -1);
	
	public Personne(String _nom) {
		this.nom = _nom;
		porteMontre = false;
		montre = EMPTY;
	}
	
	public void donnerMontre(Montre _m) {
		if (!porteMontre && !_m.getEstPortee()) {
			montre = _m;
			porteMontre = true;
			_m.setEstPortee(true);
		}
	}
	
	public void prendreMontre(Montre _m) {
		if (porteMontre) {
			montre = EMPTY;
			porteMontre = false;
			_m.setEstPortee(false);
		}
	}
	
	public void direHeure() {
		int[] h = montre.getHeure();
		System.out.println(this.nom + " dit qu'il est " + h[0] + "h" + h[1] + ".");
	}
	
	public Montre getMontre() {
		return montre;
	}

}
