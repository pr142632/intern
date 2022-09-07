package com.servletconfig;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class Servletconfig
 */
// @WebServlet("/Servletconfig")
public class Servletconfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletconfig() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	        ServletConfig config = getServletConfig();
	        Enumeration<String> e = config.getInitParameterNames();
	        String str = "";
	        out.print("<center><h1>ServletConfig Parameters</h1></center>");
	        while(e.hasMoreElements()) {
	            str = e.nextElement();
	            out.print("<h1>Parameter Name : "+str+"</h1>");
	            out.print("<h1>Parameter Value : "+config.getInitParameter(str)+"</h1>");
	            out.print("<br>");
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
