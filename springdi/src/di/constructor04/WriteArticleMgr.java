package di.constructor04;

public class WriteArticleMgr implements IWriteArticleMgr {
	IArticleDAO articleDAO;
	
	@Override
	public void write(ArticleDTO article) {
		System.out.println("WriteAricleMgr:"+article.toString());
		articleDAO.insert(article);
		
	}

	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}

	public IArticleDAO getArticleDAO() {
		return articleDAO;
	}

	public void setArticleDAO(IArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}

	
}
