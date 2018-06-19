<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Simple Numerical JSP Calculations</title>
</head>
<body>
	<%
	int term1 = Integer.parseInt(request.getParameter("term1"));
	int term2 = Integer.parseInt(request.getParameter("term2"));
	int result=0;
	String operand = request.getParameter("operand");
	session.setAttribute("term1", term1);
	session.setAttribute("term2", term2);
	
	System.out.println("JSP term1 = "+term1);
	System.out.println("JSP term2 = "+term2);
	System.out.println("JSP operand = "+operand);
	if(operand.equalsIgnoreCase("add")){
		result = term1 + term2;
	}else if (operand.equalsIgnoreCase("subtract")){
		result = term1 - term2;
	}else if (operand.equalsIgnoreCase("divide")){
		result = term1 / term2;
	}else if (operand.equalsIgnoreCase("multiply")){
		result = term1 * term2;
	}
	System.out.println("JSP result = "+result);
	%>
	<h2>The <%=term1 %> <%=operand %> <%=term2 %> =<%=result %></h2>
		
</body>
</html>