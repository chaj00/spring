package mydept;

import java.util.List;

public interface MyDeptDAO {
	//조직수 조회
	int count();
	//조직등록
	void insert(MyDeptDTO dept);
	//조직정보수정
	void update(MyDeptDTO dept);
	//조직삭제
	void delete(String id);
	
	MyDeptDTO findByDeptno(String deptno);
	
	List<MyDeptDTO> getDeptList();
	
	List<MyEmpDTO> getMemberList(String deptname);
	
}









