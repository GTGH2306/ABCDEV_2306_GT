package exercicesFonctionsSupp;

import java.util.Scanner;

public class Exo4 {

	private static String purge(String phrase, String purge) {
		for (int j = 0; j < purge.length(); j++) {
			phrase = phrase.replace(Character. toString(purge.charAt(j)), "");
		}
		return phrase;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez une phrase :");
		String phrase = sc.nextLine();
		System.out.println("Saisissez des caractères à purger :");
		String purge = sc.nextLine();
		
		System.out.println(purge(phrase, purge));
		sc.close();
		
	}

}
