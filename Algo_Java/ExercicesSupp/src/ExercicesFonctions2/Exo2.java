package ExercicesFonctions2;

public class Exo2 {

	public static void main(String[] args) {
		int[] tableau = {1,6,7,2,16,3,8};
		System.out.println("Le plus grand nombre du tableau est " + grand(tableau));
	}
	
	private static int grand(int[] tab) {
		int plus_grand = 0;
		for (int i : tab) {
			if (i > plus_grand) {
				plus_grand = i;
			}
		}
		return plus_grand;
	}
}
