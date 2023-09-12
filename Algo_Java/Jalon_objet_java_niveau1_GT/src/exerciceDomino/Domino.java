package exerciceDomino;

public class Domino {
	private int faceA, faceB;
	
	public Domino() { //Constructeur par défaut
		faceA = 0;
		faceB = 0;
	}
	
	public Domino(int _faceA, int _faceB) { //Contructeur avec paramêtres
		faceA = _faceA;
		faceB = _faceB;
	}
	public void affichePoints() { //Affiche les points sur les faces du domino courant
		System.out.println("Face A: " + this.faceA + "\tFace B: " + this.faceB);
	}
	
	public int valeur(Domino _test) { //Retourne la somme des face du domino courant + le domino testé
		return (this.faceA + this.faceB) + (_test.getFaceA() + _test.getFaceB());
	}
	
	public boolean estCompatible(Domino _test) { //Retourne si le domino courant est compatible avec le domino paramêtre
		if (this.faceA == _test.getFaceA() ||
				this.faceA == _test.getFaceB() ||
				this.faceB == _test.getFaceA() ||
				this.faceB == _test.getFaceB()) {
			return true;
		} else {
			return false;
		}
	}
	
	//GETTERS ET SETTERS
	public int getFaceA() {
		return this.faceA;
	}
	public int getFaceB() {
		return this.faceB;
	}
	public void setFaceA(int _n) {
		this.faceA = _n;
	}
	public void setFaceB(int _n) {
		this.faceB = _n;
	}

}
