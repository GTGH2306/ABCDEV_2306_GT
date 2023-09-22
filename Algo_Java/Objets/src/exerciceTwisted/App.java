package exerciceTwisted;

public class App {

	public static void main(String[] args) {
		String[] colors = {"Bleu", "Vert", "Jaune", "Orange", "Rouge", "Marron"};
		int [][] data = tournois(20, 20, 3);
		Tournament tournoisDes = new Tournament(data, colors, 6000);
		
		System.out.println("Couleur gagnante: " + tournoisDes.getColor());
		System.out.println(tournoisDes.getWinners());
		System.out.println("Chaque gagnant gagne : " + tournoisDes.getPrizeValue() + "euros !");
		
	}
	
	//Génère une liste 2D de tours pour un tournois.
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

}
