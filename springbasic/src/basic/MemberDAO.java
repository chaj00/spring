package basic;

public class MemberDAO {
	
	public void add(MemberDTO user){
		System.out.println("DAO:"+user.toString());
		System.out.println("ȸ������");
	}
	public MemberDTO getUser(String id){
		System.out.println("���̵�� ȸ�� ��ȸ�ϱ�");
		return null;
	}
}