package exerciceRobot;
import exerciceRobot.Robot.Action;

public class Manette {
	private Robot appareil;
	
	public Manette() {
		this.appareil = null;
	}
	
	public void appareillage(Robot _appareil) {
		this.appareil = _appareil;
	}
	
	public boolean input(Action _input) {
		return appareil.action(_input);
	}
}
