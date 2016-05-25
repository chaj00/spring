package di.constructor04;

public class WriteArticleMgr implements IWriteArticleMgr {
	IArticleDAO articleDAO;

	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
		System.out.println("WriteArticleMgr�� ������ ȣ�� �Ϸ�");
	}

	public IArticleDAO getArticleDAO() {
		return articleDAO;
	}

	public void setArticleDAO(IArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}
	
	@Override
	public void write(ArticleDTO article) {
		System.out.println("WriteAricleMgr:"+article.toString());
		articleDAO.insert(article);
		
	}
	
}
