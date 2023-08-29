package tutoHeritage;

public interface PeelFruit {
	/*
	 * Une interface ne peux contenir que des méthodes abstraites.
	 * "abstract" n'as pas besoin forcement d'être mis car il les méthodes sont forcement abstraites.
	 * 
	 * Pour implémenter une interface on utilise implements Classe, implements Classe2
	 * 
	 */
	
	public boolean isPeeled();
	
	public String getSkinType();
	
}
