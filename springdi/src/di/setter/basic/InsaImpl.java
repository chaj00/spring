package di.setter.basic;

public class InsaImpl implements Insa {
	MemberDAO dao;
	
	public InsaImpl(){
		
	}
	//1. 컨테이너가 InsaIml을 생성할때 dao객체를 전달해줄 수 있도록 생성자를 정의해야한다.
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("dao Injection완료");
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
