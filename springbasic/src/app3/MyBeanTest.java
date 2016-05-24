package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyBeanTest {
	public static void main(String[] args) {
		//스프링프레임워크 내부에서 객체를 관리해주는 클래스 (스프링컨테이너)를 이용해서 작업
		//1. 현재 설정정보를 담고있는 XML파일명을 전달
		Resource res = new ClassPathResource("config/bean.xml");
		//2. XML정보를 이용해서 객체를 관리하는 클래스를 생성
		BeanFactory factory = new XmlBeanFactory(res);
		MyBean obj = (MyBean)factory.getBean("obj");
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
