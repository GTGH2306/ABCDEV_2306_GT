package Exos;

public class Valide {
	public static void main (String[] args) {
		
	}
			
	public static boolean isBin(String saisie) {
		boolean not_bin = false;
		for (int i = 0; i != saisie.length(); i++ ) {
			if (saisie.charAt(i) != '0' && saisie.charAt(i) != '1') {
				not_bin = true;
			}
		}
		if (not_bin == false) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean isInt(String saisie){
		boolean not_int = false;
		for (int i = 0; i != saisie.length(); i++ ) {
			if (Character.isDigit(saisie.charAt(i)) == false) {
				not_int = true;
			}
		}
		if (not_int == false) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int stringToInt(String saisie) {
		int entier = 0;
		for (int i = 0; i != saisie.length(); i++ ) {
				entier += Math.pow(10, (saisie.length() - i)) / 10;
		}
		return entier;
	}
}