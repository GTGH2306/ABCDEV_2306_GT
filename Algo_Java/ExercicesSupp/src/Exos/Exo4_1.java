package Exos;
import java.util.Scanner;

public class Exo4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez heure :");
		int heure = sc.nextInt();
		System.out.println("Saisissez minute :");
		int minute = sc.nextInt();
		
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
		System.out.println("Dans une minute, il sera " + heure + "h" + minute + ".");
		sc.close();
	}

}
