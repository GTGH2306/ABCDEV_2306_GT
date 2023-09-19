package json1;

import org.json.JSONArray;
import org.json.JSONObject;

public class App {

	public static void main(String[] args) {
		
		//Cr�er un objet au format Json
		JSONObject jo = new JSONObject();
		//Met des �l�ments dans l'objets
		jo.put("name", "jon doe");
		jo.put("age", "22");
		jo.put("city", "chicago");
		//Affiche les �l�ments de l'objet
		System.out.println(jo.get("name") + " " + jo.get("age") + " " + jo.get("city"));
		
		
		//Cr�er un string d'un tableau au format Json
		String jsonString = "[\"�l�ment1\", \"�l�ment2\", \"�l�ment3\"]";
		
		//Transforme ce tableau Json en tableau Java
		JSONArray jsonArray = new JSONArray(jsonString);
		
		//Affiche les �l�ments du tableau
        for (int i = 0; i < jsonArray.length(); i++) {

        	System.out.println("�l�ment " + i + ": " + jsonArray.getString(i));

        }
		
	}

}
