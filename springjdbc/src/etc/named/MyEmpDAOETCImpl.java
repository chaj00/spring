package etc.named;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import myemp.MyEmpDAO;
import myemp.MyEmpDTO;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class MyEmpDAOETCImpl implements MyEmpDAO {
	private NamedParameterJdbcTemplate template;
	

	public void setTemplate(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
	/*
	 * 1차
	 * 사용자로보터 입력받을 값을 이름으로 매핑하겠다는 의미
	 * 파라미터를 map으로 관리
	 * 파라미터 name과 value를 map에 등록
	 * => index기반보다 불편
	 */

	/*@Override
	public void insert(MyEmpDTO user) {
		String sql = "insert into myemp values(:id, :pass, :addr,100000,:grade,'002',:name)";
		//sql에 파라미터를 셋팅
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("id", user.getId());
		paramMap.put("pass", user.getPass());
		paramMap.put("addr", user.getAddr());
		paramMap.put("grade", user.getGrade());
		paramMap.put("name", user.getName());
		int result = template.update(sql,paramMap);
		System.out.println(result+"개 입력성공");
	}*/
	/*
	 * 2차 작업
	 * BeanPropertySqlParameterSource기반
	 * DTO클래스의 프로퍼티명과 sql의 파라미터명이 일치하는 것을 매핑시켜서 작업
	 */
	@Override
	public void insert(MyEmpDTO user) {
		String sql = "insert into myemp values(:id, :pass, :addr,100000,:grade,'002',:name)";
		int result = template.update(sql, new BeanPropertySqlParameterSource(user));
		System.out.println(result +"개삽입(BeanpropertySql..로)");
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
