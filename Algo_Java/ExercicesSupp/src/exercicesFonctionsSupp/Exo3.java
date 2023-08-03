package exercicesFonctionsSupp;

import java.util.Scanner;

public class Exo3 {

	private static String purge(String phrase, String purge) {
		String result = phrase;
		for (int i = 0; i < purge.length(); i++) {
			result = result.replace(Character.toString(purge.charAt(i)), "");
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez une phrase :");
		String phrase = sc.nextLine();
		System.out.println("Saisissez les caractères à purger :");
		String purge = sc.nextLine();
		
		System.out.println(purge(phrase, purge));
		sc.close();
		
	}

}
