package firstexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HrTest {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("config/data.xml");
		HrDAO dao =(HrDAO)container.getBean("mydao");
		
		System.out.println("레코드수:"+ dao.count());

	}

}
