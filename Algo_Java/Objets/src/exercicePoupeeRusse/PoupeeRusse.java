package exercicePoupeeRusse;

public class PoupeeRusse {
	private boolean open;
	private int size;
	private PoupeeRusse contenu, contenant;
	private final static PoupeeRusse EMPTY = new PoupeeRusse(-1);
	
	public PoupeeRusse(int _size) {
		this.size = _size;
		this.open = false;
		this.contenant = EMPTY;
		this.contenu = EMPTY;
	}
	
	public void ouvrir() {
		if (this.contenant.equals(EMPTY)) {
			this.open = true;
		}
	}
	
	public void fermer() {
		if (this.contenant.equals(EMPTY)) {
			this.open = false;
		}
	}
	
	public void placerDans(PoupeeRusse p) {
		if (!this.open && p.open && this.size < p.size && !p.pleine) {
			p.contenu = this;
			p.pleine = true;
		}
	}
	
	public void sortirDe(PoupeeRusse p) {
		if (p.open && p.contenu == this) {
			p.contenu = EMPTY;
			p.pleine = false;
		}
	}

}
