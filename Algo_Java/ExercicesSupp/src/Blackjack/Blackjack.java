package Blackjack;
import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int argent = 100;
		int valeur_j;
		int valeur_c;
		int mise;
		String saisie;
		String tempcard;
		boolean quitter = false;
		boolean win;
		boolean busted;
		boolean valide;
		boolean blackjack;
		
		while (!quitter) {
			busted = false;
			win = false;
			blackjack = false;
			valeur_j = 0;
			valeur_c = 0;
			mise = 0;
			
			
			do { //Verifie si saisie est un nombre ou si le joueur quitte
				if (argent > 0) { //Si le joueur n'as plus d'argent, le force à quitter
					System.out.println("Vous avez " + argent + " euros.\nCombien voulez-vous miser ?\t(Entrez q pour Quitter)");
					saisie = sc.nextLine();
				} else {
					System.out.println("Oh mince, vous n'avez plus d'argent.\nN'hesitez pas a revenir moins pauvre!");
					saisie = "q";	
				}
				
				if (saisie.equals("q") || saisie.equals("Q")) { //Si joueur quitte, passe le bool quitter à True
					quitter = true;
					valide = true; //Quitter est une saisie valide
				} else if (!Valide.isInt(saisie)){ //Saisie invalide
					System.out.println("Saisie invalide, merci de saisir un entier ou Q pour quitter.");
					valide = false;
				} else { //C'est un nombre entier qui existe
					valide = true;
				}
				
				
				if (valide && !quitter) { //Verifie que le joueur peux parier cette somme s'il n'as pas quitter
					mise = Integer.parseInt(saisie);
					if (mise > argent) {
						valide = false;
						System.out.println("Vous n'avez pas autant d'argent !");
					} else if (mise < 1) {
						valide = false;
						System.out.println("Vous devez miser au moins 1 euro.");
					} else {
						valide = true;
					}
				}
			} while (!valide); //Boucle tant que l'entrée n'est pas une somme que le joueur peux parier ou qu'il quitte
			
			if (!quitter) { //Si le joueur n'as pas quitter, le fais jouer
				tempcard= Tirage.tire(); //Tire la première carte du joueur
				System.out.println("Vous tirez un " + tempcard);
				valeur_j += Tirage.valeur(tempcard, sc);
				
				tempcard= Tirage.tire(); //Tire la deuxième carte du joueur
				System.out.println("Vous tirez un " + tempcard);
				valeur_j += Tirage.valeur(tempcard, sc);
				
				tempcard= Tirage.tire(); //Tire la première carte du croupier
				System.out.println("Le croupier tire un " + tempcard);
				valeur_c += Tirage.valeurAuto(tempcard, valeur_c);
				System.out.println("Son total est de " + valeur_c);
				
				if (valeur_j == 21) { //Si il est déjà à 21: Blackjack
					blackjack = true;
				}
				
				if (!blackjack) { //S'il n'as pas Blackjack, jouer le jeu normalement.
					do { //Demander si le joueur veux une carte
						System.out.println("Votre total est de " + valeur_j);
						System.out.println("Vous voulez une autre carte?\n(o pour Oui)\t(n pour Non)");
						saisie = sc.nextLine();
						
						if (saisie.equals("o") || saisie.equals("O")) {
							tempcard= Tirage.tire();
							System.out.println("Vous tirez un " + tempcard);
							valeur_j += Tirage.valeur(tempcard, sc);
						}
					} while (!saisie.equals("n") && !saisie.equals("N") && valeur_j < 21); //Tant que le joueur veux ou qu'il est sous 21
					
					if (valeur_j > 21) { //Si plus de 21, le joueur a perdu
						System.out.println("Votre total est de " + valeur_j);
						busted = true;	
					}
					
					do { //Le croupier tire des cartes
						
							tempcard= Tirage.tire();
							System.out.println("Le croupier tire un " + tempcard);
							valeur_c += Tirage.valeurAuto(tempcard, valeur_c);
							System.out.println("Son total est de " + valeur_c);
					} while (valeur_c < 17); //Tant qu'il est sous 17
					
					if (valeur_c > 21 && !busted) { //Si le croupier a plus que 21 et que le joueur n'as pas perdu, joueur gagne
						win = true;
					} else if (valeur_c > valeur_j && valeur_c < 22){ //Si le croupier a plus que le joueur est moins que 22; le joueur perd
						busted = true;
					} else if (valeur_j > valeur_c && !busted) { //Si le joueur a plus que le croupier et n'as pas perdu, il gagne
						win = true;
					}
					
					if (win) { //Si il a gagné, il gagne sa mise
						System.out.println("Vous gagnez " + mise + " euros !");
						argent += mise;
					} else if (busted) { //Si il a perdu, il perd sa mise
						System.out.println("Vous perdez " + mise + " euros !");
						argent -= mise;
					} else { //Sinon c'est qu'il y'a égalité, il ne ce passe rien
						System.out.println("Egalite, vous gardez votre mise.");
					}
					
					
				} else { //Si il a blackjack, il gagne tout de suite sa mise * 1.5
					System.out.println("Blackjack! Vous gagnez " + Math.round(mise * 1.5) + " euros !");
					argent += Math.round(mise * 1.5);
				}
				
			}
		}// Sort ici si il a quitter
		System.out.println("Vous sortez avec " + argent + " euros en poche.");
		sc.close();
	}

}
