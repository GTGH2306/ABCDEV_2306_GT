package ExercicesFonctions;

import java.util.Scanner;

public class Exo6 {

	public static void main(String[] args) {
		String texte;
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez une phrase à écrir à l'envers : " );
		texte = sc.nextLine();
		System.out.println(inverso(texte));
		sc.close();
	}
	
	public static String inverso(String chaine) {
		String inverse = "";
		
		for (int i = 0; i < chaine.length(); i++) {
			inverse += chaine.charAt(chaine.length() - i - 1);
		}
		return inverse;
	}

}
