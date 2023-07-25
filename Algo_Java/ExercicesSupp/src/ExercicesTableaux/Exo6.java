package ExercicesTableaux;

public class Exo6 {

	public static void main(String[] args) {
		int[] tab1 = {4, 8, 7, 12};
		int[] tab2 = {3, 6};
		int resultat = 0;
		
		for (int i = 0; i <  tab2.length; i++) {
			for (int j = 0; j <  tab1.length; j++) {
				resultat += tab1[j] * tab2[i];
				
				if (i + 1 == tab2.length && j + 1 == tab1.length) {
					System.out.print(tab2[i] + "*" + tab1[j] + " = " + resultat);
				} else {
					System.out.print(tab2[i] + "*" + tab1[j] + " + ");
				}	
			}
		}
	}

}
