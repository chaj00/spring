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
		System.out.println("5. ����");
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

}








