package tutoHeritage;

public abstract class Fruit {
	private String name;
	
	/*
	 * Une classe "Abstraite" est une classe qui ne peux pas �tre utilis�e pour cr�er des objets.
	 * Pour y acc�der, c'est une autre classe qui doit h�riter de celle-ci
	 * Une m�thode "Abstraite" ne peut �tre utilis� que dans une classe abstraite.
	 * Elle devra �tre red�fini sur toutes les classes "enfant".
	 * @Override permet de red�finir une m�thode h�rit�e d'une classe parente
	 */
	public Fruit(String _name) {
		name = _name;
	}
	
	public abstract void taste();
	
	public abstract int getSize();
	
	public abstract boolean hasSeed();
	
	//Comme miam() n'est pas abstract, elle est non seulement accessible depuis tout les fruits, mais fera la m�me chose.
	public void miam() {
		System.out.println("Il faut manger 5 fruits et l�gumes par jour. / Nom du fruit : " + getName());
	}
	
	public String getName() {
		return name;
	}
}
