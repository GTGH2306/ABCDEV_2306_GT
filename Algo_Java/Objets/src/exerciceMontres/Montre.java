package exerciceMontres;

public class Montre {
	private int[] heure = new int[2];
	private boolean estPortee = false;
	
	public Montre() {
		this.heure[0] = 0;
		this.heure[1] = 0;
	}
	
	public Montre(int h, int m) {
		this.heure[0] = h;
		this.heure[1] = m;
	}
	
	public Montre(int[] _h) {
		this.heure[0] = _h[0];
		this.heure[1] = _h[1];
	}
	
	public Montre(Montre _m) {
		this.heure = _m.heure;
	}
	
	public void avancer() {
		if (this.heure[1] < 59) {
			this.heure[1] ++;
		} else {
			heure[1] = 0;
			if (heure[0] < 23) {
				heure[0] ++;
			} else {
				heure[0] = 0;
			}
		}
	}
	public int[] getHeure() {
		return heure;
	}
	
	public boolean getEstPortee() {
		return this.estPortee;
	}
	public void setEstPortee(boolean _estPortee) {
		this.estPortee = _estPortee;
	}

}
