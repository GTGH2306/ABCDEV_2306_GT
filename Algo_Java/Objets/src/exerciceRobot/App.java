package exerciceRobot;

public class App {

	public static void main(String[] args) {
		
		Robot toto = new Robot(15, 1, 45);
		Interface manette = new Interface(toto);
		manette.setVisible(true);
	}
}
