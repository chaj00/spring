package basic;

public class TestMain {
	public static void main(String[] args) {
		//1. �����ڸ� ���ؼ� MemberDAO��ü�� ����(�����ڸ� ���ؼ� ��ü�� �����ߴ�.)
		MemberDAO dao= new MemberDAO();
		InsaImpl insa = new InsaImpl(dao);
		
		//2. setter�޼ҵ带 ���ؼ� MemberDAO��ü�� ����(setter�޼ҵ带 ���ؼ� ��ü�� ����)
		MemberDAO dao2= new MemberDAO();
		InsaImpl insa2 = new InsaImpl();
		
		MemberDTO user = new MemberDTO("jang","1234","�嵿��");
		System.out.println(user.getId()+user.toString());
		insa.addUser(user);
		insa2.addUser(user);

	}

}
