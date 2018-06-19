package com.adil;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/multiply")
public class MultiplyServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{

		HttpSession session = req.getSession();

		int  term1= (int) session.getAttribute("term1");
		int  term2= (int) session.getAttribute("term2");
		int result  = term1 * term2;
		PrintWriter out = res.getWriter();
		out.println("The Multiply result ="+result);
	}

}
