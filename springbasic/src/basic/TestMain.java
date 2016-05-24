package basic;

public class TestMain {
	public static void main(String[] args) {
		//1. 생성자를 통해서 MemberDAO객체를 전달(생성자를 통해서 객체를 주입했다.)
		MemberDAO dao= new MemberDAO();
		InsaImpl insa = new InsaImpl(dao);
		
		//2. setter메소드를 통해서 MemberDAO객체를 전달(setter메소드를 통해서 객체를 주입)
		MemberDAO dao2= new MemberDAO();
		InsaImpl insa2 = new InsaImpl();
		
		MemberDTO user = new MemberDTO("jang","1234","장동건");
		System.out.println(user.getId()+user.toString());
		insa.addUser(user);
		insa2.addUser(user);

	}

}
