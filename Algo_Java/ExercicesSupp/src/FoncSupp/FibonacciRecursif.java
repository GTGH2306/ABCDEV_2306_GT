package FoncSupp;
import java.util.Scanner;

public class FibonacciRecursif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de nombre(s) de la suite de Fibonacci souhaitez-vous afficher : ");
		int nbr = sc.nextInt();
		long[] fib = new long[nbr];
		
		for(long i : fibonacci(fib, nbr)) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}
	
	private static long[] fibonacci(long[] tab, int i) {
		
		int pos = (tab.length - i);
		
		if (pos == 0) {
			tab[pos] = 0;
		} else if (pos == 1) {
			tab[pos] = 1;
		} else {
			tab[pos] = tab[pos - 1] + tab[pos - 2];
		}
		i--;
		if (i == 0) {
			return tab;
		} else {
			return(fibonacci(tab, i));
		}
	}
}
