package exerciceVoiture;

public class Ex�cution {
	public static void main(String[] args) {
		Voiture car1 = new Voiture("H�licopt�re de combat", 2400000);
		Voiture car2 = new Voiture();
		
		car1.afficher();
		car2.afficher();
		car2.setMarque("Toyota");
		car2.afficher();
		car2.setPrix(3000);
		car2.afficher();
		
	}
}
