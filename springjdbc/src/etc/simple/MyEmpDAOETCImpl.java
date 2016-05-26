package etc.simple;

import java.util.List;

import myemp.MyEmpDAO;
import myemp.MyEmpDTO;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class MyEmpDAOETCImpl implements MyEmpDAO {
	private SimpleJdbcInsert template;

	public MyEmpDAOETCImpl(SimpleJdbcInsert template) {
		super();
		this.template = template;
		//테이블정보정의
		template.withTableName("myemp");
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void insert(MyEmpDTO user) {
		template.execute(new BeanPropertySqlParameterSource(user));
	}
	
	@Override
	public void update(MyEmpDTO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public MyEmpDTO login(String id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MyEmpDTO> getMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MyEmpDTO> findByAddr(String addr) {
		// TODO Auto-generated method stub
		return null;
	}

}
