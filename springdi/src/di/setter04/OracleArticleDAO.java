package di.setter04;

public class OracleArticleDAO implements IArticleDAO {

	@Override
	public void insert(ArticleDTO article) {
		System.out.println("OracleArticleDAO:"+article.toString());
		
	}

}
