package Blackjack;

public class Valide {
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
}
