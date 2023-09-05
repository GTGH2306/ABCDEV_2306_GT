package dnd;

public abstract class Creature {
	
	public int force, dexterite, constitution, intelligence, sagesse, charisme;
	public int pv, pvTemp, classeArmure;
	public boolean inconscient;
	
	public abstract void mourir();
	public abstract void attaquer();

}
