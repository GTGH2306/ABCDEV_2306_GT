package Exos;

import java.util.Scanner;

public class Exo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jour;
		int mois;
		int annee;
		boolean bisextile;
		boolean invalide;
		
		System.out.println("Saisir jour:");
		jour = sc.nextInt();
		System.out.println("Saisir mois:");
		mois = sc.nextInt();
		System.out.println("Saisir annee:");
		annee = sc.nextInt();
		
		if (jour > 0 && mois > 0 && mois < 13 && annee != 0) {
			if (((annee % 4 == 0 && annee % 100 !=0) || annee % 400 == 0) && annee > 0) {
				bisextile = true;
			} else {
				bisextile = false;
			}
			switch (mois) {
			case 1, 3, 5, 7, 8, 10, 12:
				if (jour > 31) {
					invalide = true;
				} else {
					invalide = false;
				}
				break;
			case 4, 6, 9, 11:
				if (jour > 30) {
					invalide = true;
				} else {
					invalide = false;
				}
				break;
			default:
				if (bisextile) {
					if (jour > 29) {
						invalide = true;
					} else {
						invalide = false;
					}
				} else {
					if (jour > 28) {
						invalide = true;
					} else {
						invalide = false;
					}
				}
			}
		} else {
			invalide = true;
		}
		
		sc.close();
		if(invalide) {
			System.out.println(jour + "/" + mois + "/" + annee + " est une date invalide.");
		} else {
			System.out.println(jour + "/" + mois + "/" + annee + " est une date valide.");
		}
	}
}