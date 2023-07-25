package ExercicesTableaux;

public class Exo4 {

	public static void main(String[] args) {
		int[] tab1 = {2, 6, 7, 3, 1, 9};
		int[] tab2 = {8, 2, 4, 3, 1, 6};
		
		
		for (int i = 0; i < tab1.length && i < tab2.length; i++) {
			System.out.println(tab1[i] + " + " + tab2[i] + " = " + (tab1[i] + tab2[i]));
		}
	}
}
