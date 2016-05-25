package di.setter04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args){
		ApplicationContext container = 
				new ClassPathXmlApplicationContext("config/setter.xml");
		
		ArticleDTO article = new ArticleDTO("name","title","content","date");
		
		IWriteArticleMgr mysql_mgr= (IWriteArticleMgr)container.getBean("mgr_mysql");
		IWriteArticleMgr oracle_mgr= (IWriteArticleMgr)container.getBean("mgr_oracle");
		
		mysql_mgr.write(article);
		oracle_mgr.write(article);
		
	}
}
