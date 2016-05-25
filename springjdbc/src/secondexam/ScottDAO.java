package secondexam;

import org.springframework.jdbc.core.JdbcTemplate;

public class ScottDAO {
	private JdbcTemplate template;

	public ScottDAO(JdbcTemplate template) {
		super();
		this.template = template;
	}
	
	public int count(){
		return template.queryForObject("select count(*) from emp where deptno='10' ", Integer.class);
	}
	
}
