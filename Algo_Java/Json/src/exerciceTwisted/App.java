package exerciceTwisted;

public class App {

	public static void main(String[] args) {
		int[][] tournois =  tournois(20, 20, 3);
		
		for (int[] e : tournois) {
			for (int f : e) {
				System.out.print(f + " ");
			}
			System.out.print("\n");
		}
		
	}
	
	private static int[][] tournois(int _nbJoueurs, int _nbLances, int _nbDes){
		int[][] retour = new int[_nbJoueurs * _nbLances][_nbDes + 1];
		int joueurId = 1;
		for (int i = 0; i < retour.length; i++) {
			if (joueurId > _nbJoueurs) {
				joueurId = 1;
			}
			retour[i][0] = joueurId;
			for (int k = 1; k <= _nbDes; k++) {
				retour[i][k] = (int)Math.floor((Math.random() * 6) + 1);
			}
			joueurId ++;
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

}
