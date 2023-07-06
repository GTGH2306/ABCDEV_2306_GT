package Exos;
import java.util.Scanner;

public class ConvertisseurBinToDec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean invalide = false;
		int dec = 0;
		String saisie;
		
		do {
			System.out.println("Saisissez un nombre binaire a convertir en decimal :");
			saisie = sc.next();
			
			if (Valide.isBin(saisie)) {
				invalide = false;
				for (int i = 0; i != saisie.length(); i++ ) {
					if (saisie.charAt(i) == '1') {
						dec += Math.pow(2, (saisie.length() - (i+1)));
					}
				}
			} else {
				invalide = true;
				System.out.println("Vous n'avez pas saisie un nombre binaire.");
			}
			
		} while (invalide == true);
		System.out.println(saisie + " en binaire donne " + dec + " en decimal" );
		sc.close();
	}

}
