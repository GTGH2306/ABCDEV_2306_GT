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
				dec = Integer.parseInt(saisie);
				while (dec != 0) {
					dec /= 2;
					div ++;
				}
				
				dec = Integer.parseInt(saisie);
				for (int i = 1; i != div ; i++) {
					System.out.println(Math.pow(2 , (div - i)));
					if (dec - Math.pow(2 , (div - i)) > 0) {
						bin += Math.pow(10 , (div - i));
						dec -= Math.pow(2 , (div - i));
						System.out.println(dec);
						
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
