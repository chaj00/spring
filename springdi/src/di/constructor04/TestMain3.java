package di.constructor04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain3 {
	public static void main(String[] args){
		ApplicationContext container = 
				new ClassPathXmlApplicationContext("config/bean.xml");
		
		ArticleDTO article = new ArticleDTO("name","title","content","date");
		
		IWriteArticleMgr mysql_mgr= (IWriteArticleMgr)container.getBean("mgr_mysql");
		IWriteArticleMgr oracle_mgr= (IWriteArticleMgr)container.getBean("mgr_oracle");
		
		mysql_mgr.write(article);
		oracle_mgr.write(article);
		
		IWriteArticleMgr oracle_mgr2= (IWriteArticleMgr)container.getBean("mgr_oracle");
		
		if(oracle_mgr==oracle_mgr2){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
	}
}
