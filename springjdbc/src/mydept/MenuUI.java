package mydept;

import java.util.List;
import java.util.Scanner;


public class MenuUI implements AbstractUI {
	Scanner key = new Scanner(System.in);
	MyDeptDAO dao;
	public MenuUI(){
		
	}
	public MenuUI(MyDeptDAO dao) {
		super();
		this.dao = dao;
	}
	
	public void setDao(MyDeptDAO dao) {
		this.dao = dao;
	}
	//시작을 알리는 메소드
	public void show(){
		System.out.println("**********부서관리 시스템************");
		System.out.println("1. 조직등록");
		System.out.println("2. 조직정보수정");
		System.out.println("3. 조직수조회");
		System.out.println("4. 조직삭제");
		System.out.println("5. 부서정보조회");
		System.out.println("6. 부서목록조회");
		System.out.println("7. 부서별 사원조회");
		System.out.println("8. 종료");
		System.out.print("원하는 작업을 선택하세요:");
		int menu=key.nextInt();
		menuSelect(menu);
	}
	//show에서 선택한 값을 넘겨받아서 각각의 메소드를 선택하는 역할을 하는 메소드
	public void menuSelect(int menu){
		switch(menu){
			case 1:
				insertMenu();
				break;
			case 2:
				updateMenu();
				break;
			case 3:
				countMenu();
				break;
			case 4:
				deleteMenu();
				break;
			case 5:
				findByDeptnoMenu();
				break;
			case 6:
				showAllMenu();
				break;
			case 7:
				getMemberMenu();
				break;
			case 8:
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
		}
	}
	@Override
	public void deleteMenu() {
		System.out.println("******삭제*******");
		System.out.println("삭제할 부서번호를 입력하세요:");
		String deptno = key.next();
		dao.delete(deptno);

	}


	@Override
	public void insertMenu() {
		System.out.println("********조직등록********");
		System.out.print("부서코드:");
		String deptno = key.next();
		System.out.print("부서명:");
		String deptname = key.next();
		System.out.print("위치:");
		String loc = key.next();
		System.out.print("전화번호:");
		String telNum = key.next();
		MyDeptDTO user
			= new MyDeptDTO(deptno, deptname, loc, telNum);
		dao.insert(user);

	}


	@Override
	public void updateMenu() {
		System.out.println("********조직정보수정********");
		System.out.print("부서코드:");
		String deptno = key.next();
		System.out.print("부서명:");
		String deptname = key.next();
		System.out.print("위치:");
		String loc = key.next();
		System.out.print("전화번호:");
		String telNum = key.next();
		MyDeptDTO updateuser = 
				new MyDeptDTO(deptno, deptname, loc, telNum);
		dao.update(updateuser);
		

	}
	@Override
	public void countMenu() {
		System.out.println("전체 조직수:"+dao.count());
		
	}
	@Override
	public void findByDeptnoMenu() {
		System.out.println("********검색********");
		System.out.print("검색할 부서번호를 입력하세요:");
		String deptno = key.next();
		MyDeptDTO dept = dao.findByDeptno(deptno);

		System.out.print(dept.getDeptno()+"\t");
		System.out.print(dept.getDeptname()+"\t");
		System.out.print(dept.getLoc()+"\t");
		System.out.print(dept.getTelNum()+"\t");

	}
	@Override
	public void showAllMenu() {
		List<MyDeptDTO> deptlist = dao.getDeptList();
		for (int i = 0; i < deptlist.size(); i++) {
			MyDeptDTO dept = deptlist.get(i);
			System.out.print(dept.getDeptno()+"\t");
			System.out.print(dept.getDeptname()+"\t");
			System.out.print(dept.getLoc()+"\t");
			System.out.println(dept.getTelNum()+"\t");
		}
	}
	@Override
	public void getMemberMenu() {
		System.out.println("********부서별사원조회********");
		System.out.print("검색할 부서이름을 입력하세요:");
		String deptname = key.next();
		List<MyEmpDTO> userlist = dao.getMemberList(deptname);

		for (int i = 0; i < userlist.size(); i++) {
			MyEmpDTO user = userlist.get(i);
			System.out.print(user.getId()+"\t");
			System.out.print(user.getPass()+"\t");
			System.out.print(user.getName()+"\t");
			System.out.print(user.getAddr()+"\t");
			System.out.print(user.getGrade()+"\t");
			System.out.println(user.getDeptno()+"\t");
		}
	}


}








