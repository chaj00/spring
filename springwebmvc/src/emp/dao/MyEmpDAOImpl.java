package emp.dao;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import emp.dto.MyEmpDTO;
import emp.dto.MyEmpRowMapper;

public class MyEmpDAOImpl implements MyEmpDAO{
	private JdbcTemplate template;

	public MyEmpDAOImpl(){
		
	}
	public MyEmpDAOImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int count() {
		return template.queryForObject("select count(*) from myemp",Integer.class) ;
	}

	@Override
	public void insert(MyEmpDTO user) {
		String sql = "insert into myemp values(?,?,?,1000,?,'001',?)";
		int result =template.update(sql, user.getId(), user.getPass(),user.getAddr(),
												user.getGrade(),user.getName());
		
		System.out.println(result+"개 삽입성공");
		
	}

	@Override
	public void update(MyEmpDTO user) {
		String sql = "update myemp set pass=?, addr=?, grade=? where id=? ";
		int result = template.update(sql, user.getPass(), user.getAddr(), 
												user.getGrade(), user.getId());
		System.out.println(result+"개 수정성공");
	}

	@Override
	public void delete(String id) {
		String sql ="delete from myemp where id=? ";
		int result = template.update(sql, id);
		
		System.out.println(result+"개 삭제");
		
	}

	@Override
	public MyEmpDTO login(String id, String pass) {
		MyEmpDTO loginUser=null;
		try{
			loginUser = template.queryForObject(
										"select * from myemp where id=? and pass=?",
														new Object[]{id,pass}, 
																new MyEmpRowMapper());
	
		}catch(EmptyResultDataAccessException e){
			
		}
		
		return loginUser; 
	}

	@Override
	public List<MyEmpDTO> getMemberList() {
		return template.query("select * from myemp", new MyEmpRowMapper());
	}

	@Override
	public List<MyEmpDTO> findByAddr(String addr) {
		return template.query("select * from myemp where addr like ?", new Object[]{"%"+addr+"%"},new MyEmpRowMapper());
	}

}
