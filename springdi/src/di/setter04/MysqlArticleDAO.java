package di.setter04;

public class MysqlArticleDAO implements IArticleDAO{
	
	@Override
	public void insert(ArticleDTO article) {
		System.out.println("MysqlArticleDAO:"+article.toString());
		
	}
	
}
