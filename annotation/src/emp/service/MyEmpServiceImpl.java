package emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import emp.dao.MyEmpDAO;
import emp.dao.MyEmpDAOImpl;
import emp.dto.MyEmpDTO;

@Service
public class MyEmpServiceImpl implements MyEmpService{
	@Autowired
	@Qualifier("empdao")
	MyEmpDAO dao;


	@Override
	public int count() {
		return 0;
	}

	@Override
	public void insert(MyEmpDTO user) {
		dao.insert(user);
	}

	@Override
	public void update(MyEmpDTO user) {
		dao.update(user);
	}

	@Override
	public void delete(String id) {
		dao.delete(id);
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

	@Override
	public MyEmpDTO read(String id) {
		return dao.read(id);
	}

	
}
