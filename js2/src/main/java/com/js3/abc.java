package com.js3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class abc
 */
@WebServlet("/js2")
public class abc extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1> Registration details </h1>");
		String fn=request.getParameter("t1");
		String ln=request.getParameter("t2");
		String em=request.getParameter("t3");
		String pn =request.getParameter("t4");
		out.print(" First name " +fn +"<br> ");
		out.println(" Last name " +ln+" <br>");
		out.println(" Email  " +em +"<br>");
		out.println(" Phone No  " +pn );
		
		
	}

}
