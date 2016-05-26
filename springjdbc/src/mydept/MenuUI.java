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
	//������ �˸��� �޼ҵ�
	public void show(){
		System.out.println("**********�μ����� �ý���************");
		System.out.println("1. �������");
		System.out.println("2. ������������");
		System.out.println("3. ��������ȸ");
		System.out.println("4. ��������");
		System.out.println("5. �μ�������ȸ");
		System.out.println("6. �μ������ȸ");
		System.out.println("7. �μ��� �����ȸ");
		System.out.println("8. ����");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
		int menu=key.nextInt();
		menuSelect(menu);
	}
	//show���� ������ ���� �Ѱܹ޾Ƽ� ������ �޼ҵ带 �����ϴ� ������ �ϴ� �޼ҵ�
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
				System.out.println("�ý����� �����մϴ�.");
				System.exit(0);
		}
	}
	@Override
	public void deleteMenu() {
		System.out.println("******����*******");
		System.out.println("������ �μ���ȣ�� �Է��ϼ���:");
		String deptno = key.next();
		dao.delete(deptno);

	}


	@Override
	public void insertMenu() {
		System.out.println("********�������********");
		System.out.print("�μ��ڵ�:");
		String deptno = key.next();
		System.out.print("�μ���:");
		String deptname = key.next();
		System.out.print("��ġ:");
		String loc = key.next();
		System.out.print("��ȭ��ȣ:");
		String telNum = key.next();
		MyDeptDTO user
			= new MyDeptDTO(deptno, deptname, loc, telNum);
		dao.insert(user);

	}


	@Override
	public void updateMenu() {
		System.out.println("********������������********");
		System.out.print("�μ��ڵ�:");
		String deptno = key.next();
		System.out.print("�μ���:");
		String deptname = key.next();
		System.out.print("��ġ:");
		String loc = key.next();
		System.out.print("��ȭ��ȣ:");
		String telNum = key.next();
		MyDeptDTO updateuser = 
				new MyDeptDTO(deptno, deptname, loc, telNum);
		dao.update(updateuser);
		

	}
	@Override
	public void countMenu() {
		System.out.println("��ü ������:"+dao.count());
		
	}
	@Override
	public void findByDeptnoMenu() {
		System.out.println("********�˻�********");
		System.out.print("�˻��� �μ���ȣ�� �Է��ϼ���:");
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
		System.out.println("********�μ��������ȸ********");
		System.out.print("�˻��� �μ��̸��� �Է��ϼ���:");
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








