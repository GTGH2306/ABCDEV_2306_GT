package exerciceYoghurt;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class App {

	public static void main(String[] args) throws Exception {
		
		//Créer une URL de l'API que je veux utiliser
		URL url = new URL("https://api.devoldere.net/polls/yoghurts/");
		
		
		//Ouvre une connexion HTTP
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		conn.setRequestMethod("GET");//Configure le type de requête que je veux faire
		
		conn.connect();//Effectue une connection avec le type de requête spécifié
		
		StringBuilder informationString = new StringBuilder();//Initialise un stringBuider qui stockera le retour de l'API
		
		Scanner scanner = new Scanner(url.openStream());//Ouvre un scanner qui retourne le flux de données de l'API
		
		while (scanner.hasNext()) {//On lit les données, et tant qu'il y'en a on les ajoute au StringBuilder
			informationString.append(scanner.nextLine());
		}
		System.out.println(informationString);
		scanner.close();
		
	}

}
