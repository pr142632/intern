package com.reg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class regservlet
 */
@WebServlet("/abc")
public class regservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
		
		String submit=request.getParameter("submit");
		switch(submit) {
		case "register":doRegister(request,response);
		break;
		case "edit": doEdit(request,response);
		break;
		case "update": doUpdate(request,response);
		break;
		}
	
	
	}

	protected void doRegister(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("dis.jsp");
		rd.forward(request, response);
	}
	
	protected void doEdit(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("edit.jsp");
		rd.forward(request, response);
	}
	
	
	protected void doUpdate(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		RequestDispatcher rd=request.getRequestDispatcher("dis.jsp");
		rd.include(request, response);
		PrintWriter out = response.getWriter();
		out.println("<p style='color:red'>*Update successfully saved.</p>");
	}
}
