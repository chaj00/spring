package test;

import member.MemberInsert;
import member.MemberSelect;

//TestServlet이 넘겨준 요청 패스를 분석해서 실제 실행할 객체를 리턴
public class MyHandlerMapping {
	public Action exe(String path){
		Action action = null;
		if(path.equals("/insert.do")){
			action = new MemberInsert();
		}else if(path.equals("/select.do")){
			action = new MemberSelect();
		}
		
		return action;
	}
}
