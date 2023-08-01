package FoncSupp;

public class Exo3 {

	public static void main(String[] args) {
		System.out.println(factoriel(5));
	}
	
	private static int factoriel(int n) {
		if (n == 0) {
			return 1;
		} else {
			System.out.println(n);
			return n * factoriel(n - 1);
		}
	}

}
