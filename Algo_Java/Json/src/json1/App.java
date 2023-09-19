package json1;

import org.json.JSONArray;
import org.json.JSONObject;

public class App {

	public static void main(String[] args) {
		
		//Créer un objet au format Json
		JSONObject jo = new JSONObject();
		//Met des éléments dans l'objets
		jo.put("name", "jon doe");
		jo.put("age", "22");
		jo.put("city", "chicago");
		//Affiche les éléments de l'objet
		System.out.println(jo.get("name") + " " + jo.get("age") + " " + jo.get("city"));
		
		
		//Créer un string d'un tableau au format Json
		String jsonString = "[\"élément1\", \"élément2\", \"élément3\"]";
		
		//Transforme ce tableau Json en tableau Java
		JSONArray jsonArray = new JSONArray(jsonString);
		
		//Affiche les éléments du tableau
        for (int i = 0; i < jsonArray.length(); i++) {

        	System.out.println("Élément " + i + ": " + jsonArray.getString(i));

        }
		
	}

}
