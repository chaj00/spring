package main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
//�ܼ� view�� respose�ϴ� �͵� �����������ӿ�ũ�� ���ؼ� response�� �� �ֵ��� �����ؾ�
//���������� �����ϴ� ��� ���񽺸� ������ �� �ִ�.
public class IndexController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		return new ModelAndView("emp/index");
	}

}
