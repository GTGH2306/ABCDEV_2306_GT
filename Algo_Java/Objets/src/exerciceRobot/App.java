package exerciceRobot;
import exerciceRobot.Robot.Action;

public class App {

	public static void main(String[] args) {
		
		Robot toto = new Robot(15, 10, 15);
		Manette control = new Manette();
		control.appareillage(toto);
		
		control.input(Action.AVANCER);
	
		control.input(Action.TOURNER_DROITE);
	
		control.input(Action.AVANCER);
	
		control.input(Action.ATTAQUER);
		control.input(Action.DETRUIRE);
	}
}
