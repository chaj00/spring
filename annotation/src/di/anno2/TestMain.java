package di.anno2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args){
		ApplicationContext container = 
				new ClassPathXmlApplicationContext("config/bean.xml");
		
		ArticleDTO article = new ArticleDTO("name","title","content","date");
		
		IWriteArticleMgr mgr= (IWriteArticleMgr)container.getBean("mgr");
		
		
		mgr.write(article);
		
	}
}
