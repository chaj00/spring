package etc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain2 {
	public static void main(String[] args){
		ApplicationContext container = 
				new ClassPathXmlApplicationContext("config/etc.xml");
		
		CollectionTest bean =
				(CollectionTest)container.getBean("collection");
		
		bean.getList();
		bean.getMap();

	}
}
