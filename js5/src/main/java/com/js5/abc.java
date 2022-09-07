package com.js5;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java .io.PrintWriter;

/**
 * Servlet implementation class abc
 */
@WebServlet("/js5")
public class abc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	response.setContentType("text/html");
	PrintWriter out=response. getWriter();
	
	String id=request.getParameter("t1");
	String ps=request.getParameter("t2");
	if(id.equals("paresh") && ps.equals("123"))
	{
		
RequestDispatcher rd=request.getRequestDispatcher("js5b");
 rd.forward(request, response);

	
	}
	else if  (!id.equals("paresh") ||  !ps.equals("123"))
	{
			out.print(" <h1> checked user id and psssword </h1>");
	RequestDispatcher rd=request.getRequestDispatcher("NewFile.html");
	
	rd.include(request,response);
	
		
	}
	

	
	}
}
