package mydept;

import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;

public class MyDeptDAOImpl implements MyDeptDAO{
	private JdbcTemplate template;

	public MyDeptDAOImpl(){
		
	}
	public MyDeptDAOImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int count() {
		return template.queryForObject("select count(*) from mydept",Integer.class) ;
	}

	@Override
	public void insert(MyDeptDTO dept) {
		String sql = "insert into mydept values(?,?,?,?)";
		int result =template.update(sql, dept.getDeptno(), dept.getDeptname(),
													dept.getLoc(), dept.getTelNum());
		
		System.out.println(result+"�� ���Լ���");
		
	}

	@Override
	public void update(MyDeptDTO dept) {
		String sql = "update mydept set deptname=?, loc=?, telNum=? where deptno=? ";
		int result = template.update(sql, dept.getDeptname(), dept.getLoc(), 
												dept.getTelNum(), dept.getDeptno());
		System.out.println(result+"�� ��������");
	}

	@Override
	public void delete(String deptno) {
		String sql ="delete from mydept where deptno=? ";
		int result = template.update(sql, deptno);
		
		System.out.println(result+"�� ����");
		
	}
	@Override
	public MyDeptDTO findByDeptno(String deptno) {
		return template.queryForObject("select * from mydept where deptno = ?", new Object[]{deptno},new MyDeptRowMapper());
	}
	@Override
	public List<MyDeptDTO> getDeptList() {
		return template.query("select * from mydept", new MyDeptRowMapper());
	}
	
	@Override
	public List<MyEmpDTO> getMemberList(String deptname) {
		return template.query("select e.* from myemp e, mydept d where e.deptno=d.deptno and d.deptname like ?", new Object[]{"%"+deptname+"%"}, new MyEmpRowMapper());
	}


}
