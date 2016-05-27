package emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import emp.service.MyEmpService;

public class SearchController extends AbstractController {
	MyEmpService service;
	
	public SearchController(MyEmpService service) {
		super();
		this.service = service;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		arg0.setCharacterEncoding("euc-kr");
		
		String addr=arg0.getParameter("search");
		System.out.println(addr);
				
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("userlist", service.findByAddr(addr));
		
		mav.setViewName("emp/searchlist");
		
		return mav;
	}

}
