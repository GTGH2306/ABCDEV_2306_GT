package exerciceYoghurt;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;


public class App {

	public static void main(String[] args) throws Exception {
		
		//CrÃ©er une URL de l'API que je veux utiliser
		URL url = new URL("https://api.devoldere.net/polls/yoghurts");
		
		
		//Ouvre une connexion HTTP
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		conn.setRequestMethod("GET");//Configure le type de requÃªte que je veux faire
		
		conn.connect();//Effectue une connection avec le type de requÃªte spécifié
		
		//StringBuilder informationString = new StringBuilder();//Initialise un stringBuider qui stockera le retour de l'API
		String infos = "";
		Scanner scanner = new Scanner(url.openStream());//Ouvre un scanner qui retourne le flux de donnÃ©es de l'API
		
		while (scanner.hasNext()) {//On lit les donnÃ©es, et tant qu'il y'en a on les ajoute au StringBuilder
			infos += scanner.nextLine();
		}
		scanner.close();
		
		//Stoque les infos rÃ©cuperer dans une instance d'objet
		JSONObject reponse = new JSONObject(infos);
		//Converti le tableau au format Json dans un tableau Java
		String[] resultats = JSONStringArrayToStringArray(reponse.getJSONArray("results"));
		
		
		System.out.println(ordreDecroissantCouleurs(voteCounter(resultats), ordreApparition(resultats))[0] + " " + ordreDecroissantCouleurs(voteCounter(resultats), ordreApparition(resultats))[1]);
		
	}
	
	
	//METHODES STATIQUES
	
	
	private static String retourneCouleur(int _index) { //Retourne la couleur correspondant à un index
		String retour;
		switch (_index) {
		case 0:
			retour = "red";
			break;
		case 1:
			retour = "yellow";
			break;
		case 2:
			retour = "blue";
			break;
		case 3:
			retour = "orange";
			break;
		case 4:
			retour = "green";
			break;
		default:
			retour = "Out of Bounds";
			break;
		}
		return retour;
	}
	
	//Retourne un tableau des couleurs dans l'ordre décroissant de leur nombre de votes en gérant les égalités
	private static String[] ordreDecroissantCouleurs(int[] _liste, String[] _ordreAppa) {
		String[] retour = new String[_liste.length];
		int bigBoy;
		int bigBoyPos;
		for (int i = 0; i < retour.length; i++) { //Pour chaque position du tableau à retourner
			bigBoy = -1;
			bigBoyPos = -1;
			for (int j = 0; j < _liste.length; j++) { //Pour chaque position du tableau tester
				if (_liste[j] > bigBoy) { //Garder en mémoire la position du plus grand et sa valeur
					bigBoy = _liste[j];
					bigBoyPos = j;
				}
			}
			if (isExAequo(bigBoyPos, _liste)) { //En cas d'ex aequo avec un autre nombre du tableau
				int exAequoPos = exAequoPos(bigBoyPos, _liste); //Prendre la position du nombre avec lequel il est ex aequo
				boolean trouve = false;
				for (int k = 0; k < _ordreAppa.length && !trouve ; k++) { //Pour le tableau des ordres d'apparition
					if (_ordreAppa[k].equals(retourneCouleur(bigBoyPos))) { //Si c'est le plus grand en premier, garder cette position et arrêter de chercher
						trouve = true;
					} else if (_ordreAppa[k].equals(retourneCouleur(exAequoPos))) { //Si c'est l'ex aequo en premier, garder cette position et arrêter de chercher
						bigBoyPos = exAequoPos;
						trouve = true;
					}
				}
			}
			retour[i] = retourneCouleur(bigBoyPos); //Met dans le tableau la couleur correspondante au plus grand nombre de vote(égalité comprise)
			_liste[bigBoyPos] = -1; //Assigner la valeur du tableau testé à -1 pour pouvoir recommencer avec le second plus grand
			
		}
		return retour;
		
		
	}
	
	private static int exAequoPos(int _pos, int[] _liste) { //Renvoie la pos d'un exAequo, sinon renvoi -1
		int retour = -1;
		for (int i = 0; i < _liste.length; i++) {
			if (i == _pos) {
				continue;
			} else if (_liste[i] == _liste[_pos]) {
				retour = i;
			}
		}
		return retour;
	}
	
	private static boolean isExAequo(int _pos, int[] _liste) { //Renvoi si une position d'un tableau et égal à une autre
		boolean retour = false;
		for (int i = 0; i < _liste.length; i++) {
			if (i == _pos) {
				continue;
			} else if (_liste[i] == _liste[_pos]) {
				retour = true;
			}
		}
		return retour;
	}
	
	private static String[] JSONStringArrayToStringArray(JSONArray _array) { //Converti une liste de String JSON en liste de String
		String[] retour = new String[_array.length()];
		for (int i = 0; i < _array.length(); i++) {
			retour[i] = _array.getString(i);
		}
		
		return retour;
	}
	
	private static String[] ordreApparition(String[] _liste) { //Affiche un ordre d'apparition pour une liste de 5 elements diffÃ©rents
		String[] retour = new String[5];
		
		for (int i = 0; i < retour.length; i++) {
			for (int j = 0; j < _liste.length; j++) {
				if (!(isInList(_liste[j], retour))) {
					retour[i] = _liste[j];
					j = _liste.length;
				}
			}
		}
		
		return retour;
	}
	
	private static boolean isInList(String _test, String[] _liste) { //Verifie si un element est présent dans une liste
		boolean retour = false;
		for (String e : _liste) {
			if(_test.equals(e)) {
				retour = true;
			}
		}
		return retour;
	}
	
	private static int[] voteCounter(String[] _liste) { //Pos0: Red, Pos1: Yellow, Pos2:Blue, Pos3: Orange, Pos4: Green
		int[] retour = {0,0,0,0,0};
		for (String e : _liste) {
			switch (e) {
			case "red":
				retour[0] ++;
				break;
			case "yellow":
				retour[1] ++;
				break;
			case "blue":
				retour[2] ++;
				break;
			case "orange":
				retour[3] ++;
				break;
			case "green":
				retour[4] ++;
				break;
			}
		}
		return retour;
	}

}
