package FoncSupp;

public class FonctionRecursive {

	public static void main(String[] args) {
		System.out.println(factoriel(5));
	}
	
	private static int factoriel(int n) { //Une fonction récursive est une fonction qui fait appel à elle-même à un moment.
		if (n == 0) {
			return 1;
		} else {
			return n * factoriel(n - 1); //Si on envoyais seulement fac(n), la récursivité ferait 5 * 5 * 5 ... à l'infini.
		}
	}
}
/*
 * Une fonction récursive ajoute en mémoire les opérations jusqu'à ce que la fonction renvoi quelque chosede non récursif.
 * Elle effectue ensuite le calcul final.
 * 
 * Dans cette fonction récursive voilà comment l'ordinateur va effectuer les opérations:
 * fac(5)
 * > (5 * fac(4))
 * >> (5 * (4 * fac(3)))
 * >>> (5 * (4 * (3 * fac(2))))
 * >>>> (5 * (4 * (3 * (2 * fac(1)))))
 * >>>>> (5 * (4 * (3 * (2 * (1 * (fac(0)))))))
 * >>>>>> (5 * (4 * (3 * (2 * (1 * (1)))))) //La fonction retourne "1" quand elle a en entrée 0, ça arrête la boucle.
 * = (5 * (4 * (3 * (2 * 1))))
 * = (5 * (4 * (3 * 2)))
 * = (5 * (4 * 6))
 * = (5 * 24)
 * = (120)
 * 
 * fac(5) retourne 120
 * 
 * Dans une fonction récursive, comme pour une boucle, on veille à ce que le programme en sorte à un moment.
 * 
 */

