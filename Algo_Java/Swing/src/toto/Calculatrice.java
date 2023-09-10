package toto;

import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir deux nombres et l'opérateur
        System.out.print("Saisis le premier nombre : ");
        double num1 = scanner.nextDouble();

        System.out.print("Saisis le deuxième nombre : ");
        double num2 = scanner.nextDouble();

        System.out.print("Saisis l'opérateur (+, -, *, /) : ");
        char operator = scanner.next().charAt(0);
        
        double result;
        // Utilise une classe anonyme pour effectuer le calcul
        // Déclare une interface fonctionnelle et utilise une classe anonyme pour implémenter son opération
        Operation operation = new Operation() {
			@Override
			public double calcul() {
				switch (operator) {
				case '+':
					return num1 + num2;
				case '-':
					return num1 - num2;
				case '/':
					return num1 / num2;
				case '*':
					return num1 * num2;
				default:
					return 0;
				}
			}
        };

        
        result = operation.calcul(); // Calcul du résultat ici

        // Affiche le résultat
        System.out.println("Résultat : " + result);
        
        
        scanner.close();
    }
    
    public interface Operation{
    	public double calcul();
    }
}