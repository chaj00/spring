package emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;


@Controller
public class ListController{
	@Autowired
	MyEmpService service;
	

	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public ModelAndView runList(){
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("userlist", service.getMemberList());
		
		mav.setViewName("emp/list");
		
		return mav;
	}



}
