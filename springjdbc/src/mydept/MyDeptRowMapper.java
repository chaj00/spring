package mydept;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
//JdbcTemplate���� ������ jdbc���ø� Ŭ�������� select�� ������ �� ó���� �� �ֵ��� 
//�ϳ��� row�� ���� ó�� ������ ����ִ� ��ü�� query�޼ҵ� ���ο��� ȣ���� ��ü
public class MyDeptRowMapper implements RowMapper<MyDeptDTO> {

	@Override
	public MyDeptDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		//List�� �� ��ҷ� add��ų ���ڵ带 dto�� ��ȯ�ϴ� �۾��� ����
		
		MyDeptDTO dept = new MyDeptDTO(rs.getString(1),rs.getString(2),
									rs.getString(3),rs.getString(4));

		return dept;
	}


}
