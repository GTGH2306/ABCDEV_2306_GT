package Exos;
import java.util.Scanner;

public class ConvertisseurDecToBin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String saisie;
		int dec;
		boolean invalide = false;
		int bin = 0;
		
		do {
			System.out.println("Saisissez un entier decimal a convertir en binaire :");
			saisie = sc.next();
			if (Valide.isInt(saisie)) {
				int div = 0;
				invalide = false;
				dec = Valide.stringToInt(saisie);
				while (dec != 0) {
					dec /= 2;
					div ++;
				}
				
				dec = Valide.stringToInt(saisie);
				for (int i = 0; dec != 0 ; i++) {
					if ((dec % 2) == 1) {
						bin += Math.pow(2, (div - i));
						dec /= 2;
					}
				}
			} else {
				invalide = true;
				System.out.println("Erreur de saisie");
			}
			
			
		} while (invalide == true);
		System.out.println(saisie + " en decimal donne " + bin + " en binaire.");
		sc.close();
	}

}
