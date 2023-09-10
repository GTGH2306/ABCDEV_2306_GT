package toto;

import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande � l'utilisateur de saisir deux nombres et l'op�rateur
        System.out.print("Saisis le premier nombre : ");
        double num1 = scanner.nextDouble();

        System.out.print("Saisis le deuxi�me nombre : ");
        double num2 = scanner.nextDouble();

        System.out.print("Saisis l'op�rateur (+, -, *, /) : ");
        char operator = scanner.next().charAt(0);
        
        double result;
        // Utilise une classe anonyme pour effectuer le calcul
        // D�clare une interface fonctionnelle et utilise une classe anonyme pour impl�menter son op�ration
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

        
        result = operation.calcul(); // Calcul du r�sultat ici

        // Affiche le r�sultat
        System.out.println("R�sultat : " + result);
        
        
        scanner.close();
    }
    
    public interface Operation{
    	public double calcul();
    }
}