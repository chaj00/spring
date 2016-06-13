package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController  {
	@RequestMapping("/test.do")
	public ModelAndView main(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","스프링에서 넘어온 데이터");
		mav.setViewName("test");
		
		return mav;
	
}

		


}
