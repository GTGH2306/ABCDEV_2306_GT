package exercicesFonctionsSupp;

import java.util.Scanner;

public class Exo4 {

	private static String purge(String phrase, char purge) {
		String result = "";
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) != purge) {
				result += phrase.charAt(i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez une phrase :");
		String phrase = sc.nextLine();
		System.out.println("Saisissez un caractère à purger :");
		char purge = sc.nextLine().charAt(0);
		
		System.out.println(purge(phrase, purge));
		sc.close();
		
	}

}
