package etc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args){
		ApplicationContext container = 
				new ClassPathXmlApplicationContext("config/etc.xml");
		
		ConstructorTest bean =
				(ConstructorTest)container.getBean("test2");

	}
}
