package di.anno2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("mgr")
public class WriteArticleMgr implements IWriteArticleMgr {
	@Autowired
	@Qualifier("oracle")
	IArticleDAO articleDAO;

		
	@Override
	public void write(ArticleDTO article) {
		System.out.println("WriteAricleMgr:"+article.toString());
		articleDAO.insert(article);
		
	}
	
}
