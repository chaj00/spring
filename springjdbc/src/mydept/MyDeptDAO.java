package mydept;

import java.util.List;

public interface MyDeptDAO {
	//ȸ���ο��� ��ȸ
	int count();
	//ȸ������
	void insert(MyDeptDTO user);
	//ȸ����������
	void update(MyDeptDTO userInfo);
	//ȸ��Ż��
	void delete(String id);

	
}









