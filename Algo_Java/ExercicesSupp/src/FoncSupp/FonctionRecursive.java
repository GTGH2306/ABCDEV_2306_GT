package FoncSupp;

public class FonctionRecursive {

	public static void main(String[] args) {
		System.out.println(factoriel(5));
	}
	
	private static int factoriel(int n) { //Une fonction r�cursive est une fonction qui fait appel � elle-m�me � un moment.
		if (n == 0) {
			return 1;
		} else {
			return n * factoriel(n - 1); //Si on envoyais seulement fac(n), la r�cursivit� ferait 5 * 5 * 5 ... � l'infini.
		}
	}
}
/*
 * Une fonction r�cursive ajoute en m�moire les op�rations jusqu'� ce que la fonction renvoi quelque chosede non r�cursif.
 * Elle effectue ensuite le calcul final.
 * 
 * Dans cette fonction r�cursive voil� comment l'ordinateur va effectuer les op�rations:
 * fac(5)
 * > (5 * fac(4))
 * >> (5 * (4 * fac(3)))
 * >>> (5 * (4 * (3 * fac(2))))
 * >>>> (5 * (4 * (3 * (2 * fac(1)))))
 * >>>>> (5 * (4 * (3 * (2 * (1 * (fac(0)))))))
 * >>>>>> (5 * (4 * (3 * (2 * (1 * (1)))))) //La fonction retourne "1" quand elle a en entr�e 0, �a arr�te la boucle.
 * = (5 * (4 * (3 * (2 * 1))))
 * = (5 * (4 * (3 * 2)))
 * = (5 * (4 * 6))
 * = (5 * 24)
 * = (120)
 * 
 * fac(5) retourne 120
 * 
 * Dans une fonction r�cursive, comme pour une boucle, on veille � ce que le programme en sorte � un moment.
 * 
 */

