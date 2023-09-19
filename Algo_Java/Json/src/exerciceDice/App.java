package exerciceDice;


import org.json.JSONArray;
import org.json.JSONObject;

public class App {

	public static void main(String[] args) throws Exception {
				JSONObject reponse = ApiResponse.getApiResponse("https://api.devoldere.net/polls/dice/");
				String[] resultats = JSONStringArrayToStringArray(reponse.getJSONArray("results"));
				int[][] turns = stringToIntTab(resultats);
				
				System.out.println(scoreFinal(turns));				
	}
	
	
	private static String scoreFinal(int[][] _turns) {
		int nbJoueurs  = getNbJoueurs(_turns);
		String retour = "";
		for (int i = 1; i <= nbJoueurs; i++) {
			if (i < nbJoueurs) {
				retour += (getScorePourJoueur(i, _turns) + "/");
			} else {
				retour += (getScorePourJoueur(i, _turns));
			}
		}
		return retour;
	}
	
	private static int getScorePourJoueur(int _joueur, int[][] _turns) {
		int score = 0;
		for (int i = 0; i < _turns.length; i++) {
			if (_turns[i][0] == _joueur) {
				if ((score + getScore(_turns[i])) >= 0) {
					score += getScore(_turns[i]);
				} else {
					score = 0;
				}
			}
		}
		return score;
	}
	
	private static int getScore(int[] _turn) {
		if (_turn[1] == _turn[2]) {
			return (-2);
		} else if ((_turn[1] + _turn[2]) > 10) {
			return 3;
		} else if ((_turn[1] + _turn[2]) > 6) {
			return 1;
		} else {
			return 0;
		}
	}
	
	//Converti la liste de string obtenu en un tableau 2d de nombres pour faire plus propre
	private static int[][] stringToIntTab(String[] _liste) {
		int[][] retour = new int[_liste.length][];
		for (int i = 0; i < _liste.length; i ++) {
			retour[i] = new int[] {Character.getNumericValue(_liste[i].charAt(0)), Character.getNumericValue(_liste[i].charAt(2)), Character.getNumericValue(_liste[i].charAt(4))};
		}
		return retour;
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
	
	
	//Converti une liste de String JSON en liste de String
	private static String[] JSONStringArrayToStringArray(JSONArray _array) {
		String[] retour = new String[_array.length()];
		for (int i = 0; i < _array.length(); i++) {
			retour[i] = _array.getString(i);
		}
		
		return retour;
	}
}
