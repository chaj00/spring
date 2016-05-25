package mydept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDeptSystem {
	public static void main(String[] args) {
		ApplicationContext factory = 
			 new ClassPathXmlApplicationContext("config/scott.xml");
		AbstractUI ui = (AbstractUI)factory.getBean("deptmenu");
		while(true){
			ui.show();
		}

	}

}
