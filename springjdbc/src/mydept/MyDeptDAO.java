package mydept;

import java.util.List;

public interface MyDeptDAO {
	//������ ��ȸ
	int count();
	//�������
	void insert(MyDeptDTO dept);
	//������������
	void update(MyDeptDTO dept);
	//��������
	void delete(String id);

	
}









