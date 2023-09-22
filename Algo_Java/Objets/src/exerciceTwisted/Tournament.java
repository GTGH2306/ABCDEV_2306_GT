package exerciceTwisted;

import java.util.ArrayList;

public class Tournament {
	private final int[][] tabTours;
	private final String[] colors;
	
	private ArrayList<String> couleursTirees;
	private int[] scores;
	private double cashPrize;
	
	
	public Tournament(int[][] _tours, String[] _colors, double _cashPrize) {
		tabTours = _tours;
		colors = _colors;
		couleursTirees = new ArrayList<String>();
		for (int i = 0; i < getNombreDeDoubles(this.tabTours); i ++) {
			couleursTirees.add(colors[(int)Math.floor(Math.random() * colors.length)]);
		}
		scores = new int[getNbJoueurs(this.tabTours)];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = getScorePourJoueur(i, this.tabTours);
		}
		cashPrize = _cashPrize;
	}
	
	public String getWinners() {
		ArrayList<Integer> winners = new ArrayList<Integer>();
		String retour = "";
		for (int i = 0; i < this.scores.length; i++) {
			if (this.scores[i] == getWinnerScore(this.scores)) {
				winners.add(i + 1);
			}
		}
		
		for (int j = 0; j < winners.size(); j++) {
			retour += winners.get(j);
			if (j != (winners.size() - 1)){
				retour += "/";
			}
		}
		return retour;
	}
	
	
	
	public String getColor() {
		ArrayList<String> colorNames = new ArrayList<String>();
		ArrayList<Integer> colorVotes = new ArrayList<Integer>();
		int bigBoy = -1;
		int bigBoyPos = -1;
		
		for (int i = 0; i < this.couleursTirees.size(); i++) {
			if (isInList(this.couleursTirees.get(i), colorNames)) {
				colorVotes.set(posInList(this.couleursTirees.get(i), colorNames), (colorVotes.get(posInList(this.couleursTirees.get(i), colorNames)) + 1));
			} else {
				colorNames.add(this.couleursTirees.get(i));
				colorVotes.add(1);
			}
		}
		
		for (int i = 0; i < colorVotes.size(); i++) {
			if (colorVotes.get(i) > bigBoy) {
				bigBoy = colorVotes.get(i);
				bigBoyPos = i;
			}
		}
		return colorNames.get(bigBoyPos);	
	}
	
	public double getPrizeValue() {
		return (this.cashPrize / getNumberOfWinner());
	}
	
	
	
	//METHODES PRIVEES
	
	private int getNumberOfWinner() {
		int retour = 0;
		for (int i = 0; i < this.scores.length; i++) {
			if (this.scores[i] == getWinnerScore(this.scores)) {
				retour ++;
			}
		}
		return retour;
	}
	
	private boolean isInList(String _test, ArrayList<String> _liste) {
		boolean retour = false;
		for (int i = 0; i < _liste.size(); i++) {
			if (_test.equals(_liste.get(i))) {
				retour = true;
			}
		}
		return retour;
	}
	
	private int posInList(String _test, ArrayList<String> _liste) {
		for (int i = 0; i < _liste.size(); i++) {
			if (_test.equals(_liste.get(i))) {
				return i;
			}
		}
		return -1;
	}
	
	private int getNombreDeDoubles(int[][] _tours) {
		int nbDouble = 0;
		for (int i = 0; i < _tours.length; i++) {
			boolean dejaEgal = false;
			for (int j = 1; j < _tours[i].length; j++) {
				if (isExAequo(j, _tours[i]) && !dejaEgal) {
					nbDouble ++;
					dejaEgal = true;
				}
			}
		}
		return nbDouble;
	}
	
	//Retourne le nombre de joueurs qui ont participé
	private static int getNbJoueurs(int[][] _liste) {
		int retour = 0;
		for (int i = 0; i < _liste.length; i++) {
			if (_liste[i][0] > retour) {
				retour = _liste[i][0];
			}
		}
		return retour;
	}
	
	private int getScorePourJoueur(int _joueurPos, int[][] _turns) {
		int score = 0;
		for (int i = 0; i < _turns.length; i++) {
			if (_turns[i][0] == (_joueurPos + 1)) {
				if ((score + getScore(_turns[i])) >= 0) {
					score += getScore(_turns[i]);
				} else {
					score = 0;
				}
			}
		}
		return score;
	}
	
	private int getScore(int[] _tour) {
		int total = 0;
		for (int j = 1; j < _tour.length; j++) {
			total += _tour[j];
		}
		if (total == 3 || total == 18) {
			return 3;
		} else if (total >= 12) {
			return 2;
		} else if (total >= 6) {
			return 1;
		} else {
			return 0;
		}	
	}
	
	private int getWinnerScore(int[] _scores) {
		int bigBoy = -1;
		for (int i = 0; i < _scores.length; i ++) {
			if (_scores[i] > bigBoy) {
				bigBoy = scores[i];
			}
		}
		return bigBoy;
	}
	
	private boolean isExAequo(int _pos, int[] _liste) { //Renvoi si une position d'un tableau et égal à une autre
		boolean retour = false;
		for (int i = 1; i < _liste.length; i++) {
			if ((_liste[i] == _liste[_pos]) && !(i == _pos)) {
				retour = true;
			}
		}
		return retour;
	}
}
