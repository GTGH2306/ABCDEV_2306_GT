package exerciceAquarium;

public class Algue extends Entity{
	
	private int pv;
	
	public Algue(){
		super("algue");
	}
	
	public void setPv(int _pv) {
		this.pv = _pv;
	}
	public int getPv() {
		return this.pv;
	}

	@Override
	public void comportement() {
		if (pv == 0) {
			this.getMaison().getAlgues().remove(this.getMaison().getAlgues().indexOf(this));
		} else {
			pv ++;
		}
	}
}
