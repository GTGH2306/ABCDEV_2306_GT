package tutoHeritage;

public abstract class Fruit {
	private String name;
	
	/*
	 * Une classe "Abstraite" est une classe qui ne peux pas être utilisée pour créer des objets.
	 * Pour y accèder, c'est une autre classe qui doit hériter de celle-ci
	 * Une méthode "Abstraite" ne peut être utilisé que dans une classe abstraite.
	 * Elle devra être redéfini sur toutes les classes "enfant".
	 * @Override permet de redéfinir une méthode héritée d'une classe parente
	 */
	public Fruit(String _name) {
		name = _name;
	}
	
	public abstract void taste();
	
	public abstract int getSize();
	
	public abstract boolean hasSeed();
	
	//Comme miam() n'est pas abstract, elle est non seulement accessible depuis tout les fruits, mais fera la même chose.
	public void miam() {
		System.out.println("Il faut manger 5 fruits et légumes par jour. / Nom du fruit : " + getName());
	}
	
	public String getName() {
		return name;
	}
}
