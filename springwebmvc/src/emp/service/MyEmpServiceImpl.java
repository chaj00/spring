package emp.service;

import java.util.List;

import emp.dao.MyEmpDAO;
import emp.dao.MyEmpDAOImpl;
import emp.dto.MyEmpDTO;

public class MyEmpServiceImpl implements MyEmpService{
	MyEmpDAO dao;
	
	public MyEmpServiceImpl(){
		
	}
	public MyEmpServiceImpl(MyEmpDAO dao) {
		super();
		this.dao = dao;
	}

	public void setDao(MyEmpDAO dao) {
		this.dao = dao;
	}

	@Override
	public int count() {
		return 0;
	}

	@Override
	public void insert(MyEmpDTO user) {
		
	}

	@Override
	public void update(MyEmpDTO user) {
		
	}

	@Override
	public void delete(String id) {
		
	}

	@Override
	public MyEmpDTO login(String id, String pass) {
		return null;
	}

	@Override
	public List<MyEmpDTO> getMemberList() {
		return dao.getMemberList();
	}

	@Override
	public List<MyEmpDTO> findByAddr(String addr) {
		return dao.findByAddr(addr);
	}

	
}
