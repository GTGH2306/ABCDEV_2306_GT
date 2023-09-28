package exerciceAquarium;

public class Algue extends Entity{
	
	
	public Algue(int _age){
		super("algue");
		age = _age;
	}
	
	public Algue(int _age, int _pv, Aquarium _maison) {
		super("algue");
		age = _age;
		pv = _pv;
		maison = _maison;
	}
	
	

	@Override
	public void comportement() {
		this.age ++;
		if (pv > 0) {
			pv ++;
		}
		if(age >= 20) {
			System.out.println(this.getNom() + " meurt de vieilesse.");
			this.vivant = false;
		}
		seReproduire();
	}
	
	public String toString() {
		return ("Algue - Pv: " + this.pv);
	}


	@Override
	public void seReproduire() {
		if (this.pv >= 10) {
			int halfPv = this.pv / 2;
			this.pv = halfPv;
			this.maison.getAlgues().add(new Algue(0, halfPv, this.maison));
		}
	}
}
