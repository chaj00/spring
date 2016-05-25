package secondexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScottTest {
	public static void main(String[] args){
		ApplicationContext container = new ClassPathXmlApplicationContext("config/data2.xml");
		
		ScottDAO dao=(ScottDAO)container.getBean("dao");
		System.out.println("Á÷¿ø¼ö:"+dao.count());
	}
}
