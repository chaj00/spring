package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyBeanTest04 {
	public static void main(String[] args) {
		System.out.println("*********ApplicationContext객체 생성전********");
		ApplicationContext factory =
							new ClassPathXmlApplicationContext("config/bean.xml");
		System.out.println("*********ApplicationContext객체 생성후********");
		System.out.println("*********getBean호출전********");
		MyBean obj = (MyBean)factory.getBean("obj");
		System.out.println("*********getBean호출후********");
		test1(obj);
		test2(obj);
	}
	public static void test1(MyBean obj){
		//MyBeanKO클래스를 2번사용
		obj.sayHello("장동건");
		obj.sayHello("장동건");

	}
	public static void test2(MyBean obj){
		//MyBeanKO클래스를 3번사용
		obj.sayHello("장동건");
		obj.sayHello("장동건");
		obj.sayHello("장동건");
	}

}
