package exercicePersonnages;

public class IA extends Joueur {
	
	public IA(String _pseudo) {
		super(_pseudo, new int[] {01, 01, 2000});
	}
	
	public Personnage jouerCarte() {
		int rdm = Random.rdmInt(0, this.cartes.size() - 1);
		Personnage retour = this.cartes.get(rdm); 
		System.out.println(this.getPseudo() + " joue " + this.cartes.get(rdm).getNom() + ".");
		this.cartes.remove(rdm);
		return retour;
	}
	
	public int jouerStar() {
		int rdm = Random.rdmInt(0, (this.getStar() /2));
		rdm += Random.rdmInt(0, (this.getStar() /2));
		this.setStar(this.getStar() - rdm);
		System.out.println(this.getPseudo() + " met " + rdm + " stars.");
		return rdm;
	}

}
