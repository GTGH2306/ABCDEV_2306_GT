package exercicePersonnages;

import java.util.Scanner;

public class Partie {
	
	private Joueur play1;
	private Joueur play2;
	private int nbTours;
	private int pvMax;
	private int starMax;
	public static Scanner sc = new Scanner(System.in);
	
	
	public Partie(Joueur _play1, Joueur _play2) {
		play1 = _play1;
		play2 = _play2;
		nbTours = 4;
		pvMax = 12;
		starMax = 12;
		play1.setPv(this.pvMax);
		play2.setPv(this.pvMax);
		play1.setStar(this.starMax);
		play2.setStar(this.starMax);
	}
	
	public void jouer() {
		while(this.nbTours > 0) {
			tour();
		}
		sc.close();
	}
	
	public void tour() {
		Personnage cartej1;
		Personnage cartej2;
		int starj1;
		int starj2;
		
		cartej1 = this.play1.jouerCarte();
		starj1 = this.play1.jouerStar();
		
		cartej2 = this.play2.jouerCarte();
		starj2 = this.play2.jouerStar();
		
		if ((1 + cartej1.getPuissance() * starj1) > (1 + cartej2.getPuissance() * starj2)) {
			System.out.println(this.play1.getPseudo() + " inflige " + (2 + Math.abs(cartej1.getPuissance() - cartej2.getDefense()) + " à " + this.play2.getPseudo()));
			this.play2.setPv(this.play2.getPv() - (2 + Math.abs(cartej1.getPuissance() - cartej2.getDefense())));
		} else if ((1 + cartej2.getPuissance() * starj2) > (1 + cartej1.getPuissance() * starj1)) {
			System.out.println(this.play2.getPseudo() + " inflige " + (2 + Math.abs(cartej2.getPuissance() - cartej1.getDefense()) + " à " + this.play1.getPseudo()));
			this.play1.setPv(this.play1.getPv() - (2 + Math.abs(cartej2.getPuissance() - cartej1.getDefense())));
		} else {
			System.out.println("Forces Egales");
		}
		
		nbTours --;
		if (hasWinner(this.play1, this.play2)) {
			nbTours = 0;
		}
		
		if (nbTours <= 0) {
			System.out.println("Le gagnant est... " + getWinnerName(this.play1, this.play2) + "!");
		}
		
		System.out.println("------\nPV " + this.play1.getPseudo() + ": " + this.play1.getPv() + "\tStars: " + this.play1.getStar());
		System.out.println("PV " + this.play2.getPseudo() + ": " + this.play2.getPv() + "\tStars: " + this.play2.getStar() + "\n------");
		
		Joueur temp = this.play1;
		this.play1 = this.play2;
		this.play2 = temp;
		temp = null;
	}
	
	public boolean hasWinner(Joueur _play1, Joueur _play2) {
		if (_play1.getPv() < 1 || _play2.getPv() < 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getWinnerName(Joueur _play1, Joueur _play2) {
		if (_play1.getPv() < _play2.getPv()) {
			return _play2.getPseudo();
		} else if(_play1.getPv() > _play2.getPv()) {
			return _play1.getPseudo();
		} else {
			return "personne";
		}
	}



	public int getPvMax() {
		return pvMax;
	}


	public int getStarMax() {
		return starMax;
	}


}
