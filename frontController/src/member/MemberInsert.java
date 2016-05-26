package member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.Action;

public class MemberInsert implements Action {
	public void run(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		System.out.println("MemberInsert");
		
	}
}
