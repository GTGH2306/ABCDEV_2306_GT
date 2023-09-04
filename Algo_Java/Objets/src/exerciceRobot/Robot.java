package exerciceRobot;

public class Robot {
	private final int FORCE, VITESSE_MARCHE, VITESSE_ROTATION;
	private double posx, posy, angle;
	public enum Action {
		AVANCER, RECULER, TOURNER_GAUCHE, TOURNER_DROITE, DETRUIRE, ATTAQUER //Actions disponible depuis la t�l�commande
	} 
	
	public Robot(int _force, int _vitesseMarche, int _vitesseRot) { //Constructeur
		this.FORCE = _force;
		this.VITESSE_MARCHE = _vitesseMarche;
		this.VITESSE_ROTATION = _vitesseRot;
		this.angle = 0;
		this.posx = 0;
		this.posy = 0;
	}
	
	public boolean action(Action _action) { //Actionne diff�rentes m�thodes selon le bouton de la t�l�commande
		//Retourne true si l'action a pu �tre effectuer
		switch (_action) {
		case AVANCER:
			return marche(1);
		case RECULER:
			return marche(-1);
		case TOURNER_GAUCHE:
			return tourner(1);
		case TOURNER_DROITE:
			return tourner(-1);
		case DETRUIRE:
			return detruire();
		case ATTAQUER:
			return attaquer();
		default:
			return false;
		}
	}
	public boolean marche(int _avantArriere) { //Le param�tre d�fini si le robot avance (1) ou recule (-1)
		if (_avantArriere > 0) { //Calcul les pos X et Y du robot apr�s un mouvement sur l'angle ou il regarde
			this.posx = this.posx + VITESSE_MARCHE * Math.cos((this.angle * Math.PI) / 180d);
			this.posy = this.posy + VITESSE_MARCHE * Math.sin((this.angle * Math.PI) / 180d);
			//Arrondi
			this.posx = Math.round(this.posx * 100) / 100d;
			this.posy = Math.round(this.posy * 100) / 100d;
			return true;
		} else if (_avantArriere < 0) { //Pareil � reculons
			this.posx = this.posx - VITESSE_MARCHE * Math.cos((this.angle * Math.PI) / 180d);
			this.posy = this.posy - VITESSE_MARCHE * Math.sin((this.angle * Math.PI) / 180d);
			//Arrondi
			this.posx = Math.round(this.posx * 100) / 100d;
			this.posy = Math.round(this.posy * 100) / 100d;
			return true;
		} else {
			return false;
		}
	}
	public boolean tourner(int _sens) { //Le param�tre d�finit si le robot tourne vers la gauche (1) ou vers la droite (-1)
		if (_sens > 0) {
			this.angle += VITESSE_ROTATION;
		} else if (_sens < 0) {
			this.angle -= VITESSE_ROTATION;
		} else {
			return false;
		}
		
		if (this.angle >= 360) { //Condition pour ne pas cummuler les degr�s au del� de 360 ou -360
			this.angle -= 360;
		} else if (this.angle <= -360) {
			this.angle += 360;
		}
		return true;
	}
	
	public boolean attaquer() {
		//Remplacer par code pour attaquer une entit�e
		//Suggestion: Calculer des d�gats selon la force sur une entit�e entr�e en param�tre
		if (this.FORCE > 5) {
			System.out.println("MEURT!");
			return true;
		} else {
			System.out.println("Oopsie.");
			return false;
		}
	}
	public boolean detruire() {
		//Remplacer par code pour d�truire quelque chose
		//Suggestion: Mettre une cible en param�tre le d�truire si Force plus haute que la resistance de la cible
		if (this.FORCE > 20) {
			System.out.println("DETRUIRE!");
			return true;
		} else {
			System.out.println("Oopsie.");
			return false;
		}
	}
	
	public void afficherPos() { //Ecrire position dans la console
		System.out.println("Position X : " + this.posx + "\nPosition Y : " + this.posy);
	}
	
	public double getAngle() { //Getter Angle
		return this.angle;
	}
}
