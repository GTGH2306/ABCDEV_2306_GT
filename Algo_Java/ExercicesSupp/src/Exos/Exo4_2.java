package Exos;
import java.util.Scanner;

public class Exo4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez heure :");
		int heure = sc.nextInt();
		System.out.println("Saisissez minute :");
		int minute = sc.nextInt();
		System.out.println("Saisissez seconde :");
		int seconde = sc.nextInt();
		
		if (seconde == 59) {
			seconde = 0;
			if (minute == 59) {
				minute = 0;
				if (heure == 23) {
					heure = 0;
				} else {
					heure ++;
				}
			} else {
				minute ++;
			}
		} else {
			seconde ++;
		}
		System.out.println("Dans une seconde, il sera " + heure + "h" + minute + " et " + seconde + " seconde(s).");
		sc.close();
	}

}
