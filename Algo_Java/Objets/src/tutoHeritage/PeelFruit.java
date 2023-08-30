package tutoHeritage;

public interface PeelFruit {
	/*
	 * Une interface ne peux contenir que des m�thodes abstraites.
	 * "abstract" n'as pas besoin forcement d'�tre mis car il les m�thodes sont forcement abstraites.
	 * Pareil pour "public"
	 * 
	 * Pour impl�menter des interfaces on utilise implements Classe, Classe2, etc
	 * 
	 */
	
	public boolean isPeeled();
	
	public String getSkinType();
	
}
