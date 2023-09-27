package exercicePersonnages;

public class Random {
	
	public static int rdmInt(int _min, int _max) {
		return (int) Math.floor(Math.random() *(_max - _min + 1) + _min);
	}

}
