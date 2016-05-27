package emp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

public class ListController extends AbstractController {
	MyEmpService service;
	
	public ListController(MyEmpService service) {
		super();
		this.service = service;
	}


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("userlist", service.getMemberList());
		
		mav.setViewName("emp/list");
		
		return mav;
	}

}
