package com.js4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Java4
 */
@WebServlet("/abc")
public class Java4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Java4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
    public void init() throws ServletException
    {
        System.out.println(" Servlet has been Initialized...");
    }



   @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
    {
        PrintWriter out = res.getWriter();
       
        out.println(" <h1> Servlet Life Cycle Has three stages  1. Initialization 2. Servicen 3. Destroy");
        System.out.println("Servlet started servicing...<h1>");
    }



   @Override
    public void destroy()
    {
        System.out.println("Servlet has been Destroyed...");
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
