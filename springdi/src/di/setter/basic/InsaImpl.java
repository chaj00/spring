package di.setter.basic;

public class InsaImpl implements Insa {
	MemberDAO dao;
	
	public InsaImpl(){
		
	}
	//1. �����̳ʰ� InsaIml�� �����Ҷ� dao��ü�� �������� �� �ֵ��� �����ڸ� �����ؾ��Ѵ�.
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("dao Injection�Ϸ�");
	}
		
	
	public MemberDAO getDao() {
		return dao;
	}
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}
	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);		
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
