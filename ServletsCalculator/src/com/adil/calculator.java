package com.adil;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/calculator")
public class calculator extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int term1 = Integer.parseInt(req.getParameter("term1"));
		int term2 = Integer.parseInt(req.getParameter("term2"));
		String operand = req.getParameter("operand");
		
		HttpSession session = req.getSession();
		session.setAttribute("term1", term1);
		session.setAttribute("term2", term2);
		System.out.println("term1 = "+term1);
		System.out.println("term2 = "+term2);
		System.out.println("operand = "+operand);
		if(operand.equalsIgnoreCase("add")){
			RequestDispatcher rd = req.getRequestDispatcher("add");
			rd.forward(req, res);
		}else if (operand.equalsIgnoreCase("subtract")){
			RequestDispatcher rd = req.getRequestDispatcher("subtract");
			rd.forward(req, res);
		}
		else if (operand.equalsIgnoreCase("divide")){
			RequestDispatcher rd = req.getRequestDispatcher("divide");
			rd.forward(req, res);
		}else if (operand.equalsIgnoreCase("multiply")){
			RequestDispatcher rd = req.getRequestDispatcher("multiply");
			rd.forward(req, res);
		}
	}

}
