package mydept;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
//JdbcTemplate같은 스프링 jdbc템플릿 클래스에서 select를 수행한 후 처리할 수 있도록 
//하나의 row에 대한 처리 정보를 담고있는 객체로 query메소드 내부에서 호출할 객체
public class MyDeptRowMapper implements RowMapper<MyDeptDTO> {

	@Override
	public MyDeptDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		//List의 한 요소로 add시킬 레코드를 dto로 변환하는 작업을 수행
		
		MyDeptDTO dept = new MyDeptDTO(rs.getString(1),rs.getString(2),
									rs.getString(3),rs.getString(4));

		return dept;
	}


}
