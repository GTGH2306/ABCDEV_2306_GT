package tutoHeritage;

public interface PeelFruit {
	/*
	 * Une interface ne peux contenir que des méthodes abstraites.
	 * "abstract" n'as pas besoin forcement d'être mis car il les méthodes sont forcement abstraites.
	 * Pareil pour "public"
	 * 
	 * Pour implémenter des interfaces on utilise implements Classe, Classe2, etc
	 * 
	 */
	
	public boolean isPeeled();
	
	public String getSkinType();
	
}
