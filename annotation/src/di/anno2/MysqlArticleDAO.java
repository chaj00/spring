package di.anno2;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MysqlArticleDAO implements IArticleDAO{
	
	@Override
	public void insert(ArticleDTO article) {
		System.out.println("MysqlArticleDAO:"+article.toString());
		
	}
	
}
