package exerciceDice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class ApiResponse {
	public static JSONObject getApiResponse(String _url) throws Exception{
		URL url = new URL(_url);
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
		return new JSONObject(infos);
	}
}
