package exerciceRobot;

import exerciceRobot.Robot.Action;

public class App {

	public static void main(String[] args) {
		
		Robot toto = new Robot(15, 10, 90);
		System.out.println(toto.getAngle());
		toto.afficherPos();
		toto.action(Action.AVANCER);
		System.out.println(toto.getAngle());
		toto.afficherPos();
		toto.action(Action.ATTAQUER);
		toto.action(Action.DETRUIRE);
		toto.action(Action.TOURNER_GAUCHE);
		System.out.println(toto.getAngle());
		toto.action(Action.AVANCER);
		toto.afficherPos();
		
	}

}
