package com.java6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class js6
 */
@WebServlet("/js6")
public class js6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public js6() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		Cookie[] cookies =request.getCookies();
		boolean f=false;
		
		String n2 ="";
		
	
		if(cookies == null)
		{
			out.print("<h1> please enter name in home page <h1>");
			return;
		}
		
		
		
		else 
		{
			
		
		for(Cookie c:cookies)
		{
			String t=c.getName();
			if(t.equals("un"))
			{
				f=true;
				n2=c.getValue();
				
			}
		}
	
	}
	if(f)
	{
		
		
		out.print("<h1> thank you " + n2 + "</h1>");
	}
	else  
	{
		out.print("<h1> please enter your name in home page  <h1>");
	}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
