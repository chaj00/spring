<%@page import="java.sql.Connection"%>
<%@ page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import= "javax.sql.*, javax.sql.*, javax.naming.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>JNDI를 이용해서 커넥션 풀 접근하기</h1>
	<h3>
		WAS에서 지원하는 커넥션풀을 이용하여 커넥션 관리하기, WAS마다 들록된 커넥션풀에 접근하는 방법은 모두 다를것이므로 커넥션을 업어올수 있는 표준AOI가 없어져야  하며
	    javax.sql 패키지의 DataSource가 표준 API이다. context.xml &lt;resource&gt; 에 등록되어 있는 name으로 lookup해서 찾아온 후 이용한다.
	</h3>
	 
	 <%
	 	//1. WAS에 등록된 자원을 찾아오기 위한 객체를 생성
	 	InitialContext context = new InitialContext();
	 	
	 	//2. InitialContext객체의 lookup메소드에 찾을 resource의 이름을 정의하여
	 	//   자원을 찾아온다.
	 	//   => Was에 등록된 커넥션풀을 접근할 수 있는 객체를 받아온다.
	 	DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/myspring");
		
	 	//기존의 DriverManager를 이용해서 Connection을 구하는 작업은 요청이 들어올때마다
		//Connection을 만들어서 리턴하지만
		//DataSource를 이용해서 Connection을 구하는 작업은 미리 만들어 놓은 커넥션풀에 접근해서 
		//커넥션을 받아와 리턴한다.
		
		Connection con = ds.getConnection();
		System.out.println("con=>"+con);
	 %>

</body>
</html>