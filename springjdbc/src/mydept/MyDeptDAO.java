package mydept;

import java.util.List;

public interface MyDeptDAO {
	//회원인원수 조회
	int count();
	//회원가입
	void insert(MyDeptDTO user);
	//회원정보수정
	void update(MyDeptDTO userInfo);
	//회원탈퇴
	void delete(String id);

	
}









