package ExercicesBoucles;

public class Factor {

	public static int entier(int a) {
		int result = 1;
		
		for (int i = 1; i <= a; i++) {
			result = result * i;
		}
		return result;
	}

}
