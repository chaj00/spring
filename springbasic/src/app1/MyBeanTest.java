package app1;
/*
 * 결합도가 극도로 높은 프로그램
 * ===> 클래스가 결합도가 강하고 의존이 높다. 사용되어지는 클래스가 변경되면
 *      수정되어야 하는 범위가 넓어진다.
 *      즉, 사용하는 클래스를 모두다 변경해야 한다.
 *      oop특성이 적용 안되어 있다.
 */
public class MyBeanTest {

	public static void main(String[] args) {
		MyBeanKO obj = new MyBeanKO();
		test1(obj);
		test2(obj);
	}
	public static void test1(MyBeanKO obj){
		//MyBeanKO클래스를 2번사용
		obj.sayHello("장동건");
		obj.sayHello("장동건");
		
	}
	public static void test2(MyBeanKO obj){
		//MyBeanKO클래스를 3번사용
		obj.sayHello("장동건");
		obj.sayHello("장동건");
		obj.sayHello("장동건");
	}
}
