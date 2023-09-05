package dnd;

public class Dice {
	
	//D4
	public static int dFour() {
		return dSolo(4);
	}
	public static int dFour(int _nombres) {
		return dMultiple(_nombres, 4);
	}
	//D6
	public static int dSix() {
		return dSolo(6);
	}
	public static int dSix(int _nombres) {
		return dMultiple(_nombres, 6);
	}
	//D8
	public static int dEight() {
		return dSolo(8);
	}
	public static int dEight(int _nombres) {
		return dMultiple(_nombres, 8);
	}
	//D10
	public static int dTen() {
		return dSolo(10);
	}
	public static int dTen(int _nombres) {
		return dMultiple(_nombres, 10);
	}
	//D12
	public static int dTwelve() {
		return dSolo(12);
	}
	public static int dTwelve(int _nombres) {
		return dMultiple(_nombres, 12);
	}
	//D20
	public static int dTwenty() {
		return dSolo(20);
	}
	public static int dTwenty(int _nombres) {
		return dMultiple(_nombres, 20);
	}
	//D100
	public static int dHundred() {
		return dSolo(100);
	}
	public static int dHundred(int _nombres) {
		return dMultiple(_nombres, 100);
	}
	
	//Dx
	private static int dSolo(int _faces) {
		return ((int)Math.floor(Math.random() * _faces + 1));
	}
	
	//xDy
	private static int dMultiple(int _nombre, int _faces) {
		int[] tab = new int[_nombre];
		int total = 0;
		for (int i = 0; i < tab.length; i++) {
			tab[i] = dSolo(_faces);
			if (i < tab.length - 1) {
				System.out.print(tab[i] + " + ");
			} else {
				System.out.println(tab[i]);
			}
			total += tab[i];
		}
		return total;
	}
	
	//Tirer une cara
	public static int caraRdm() {
		int[] tab = new int[4];
		int total = 0;
		int faible = 21;
		for (int i = 0; i < tab.length; i++) {
			tab[i] = dSix();
			if (i < tab.length - 1) {
			} else {
			}
			if (tab[i] < faible) {
				faible = tab[i];
			}
			total += tab[i];
		}
		total -= faible;
		return total;
	}
	//Mod
	public static int mod(int _cara) {
		int mod = -5;
		while (_cara > 1) {
			_cara -= 2;
			mod += 1;
		}
		return mod;
	}
	
	
}
