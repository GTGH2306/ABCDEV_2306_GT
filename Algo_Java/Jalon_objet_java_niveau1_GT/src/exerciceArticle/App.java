package exerciceArticle;

public class App {

	public static void main(String[] args) {
		Article article = new Article();
		Article shampoingOeuf = new Article("00431H", "Shampoing aux oeufs Tahiti", 3.5);
		Article processeurAMD = new Article("01034I", "AMD Ryzen 7 2700x", 289.99);
		Article.setTauxTVA(12.5);
		
		article.afficherArticle();
		shampoingOeuf.afficherArticle();
		processeurAMD.afficherArticle();
	}

}
