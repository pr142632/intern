package com.jas;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
/**
 * Servlet implementation class j1
 */
@WebServlet("/ja1")
public class j1 extends HttpServlet {
    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
response.setContentType("text/html");
PrintWriter out =response.getWriter();
out.print("<center>");
out.print("<h1> Welcome servlet one <br> thank you  </h1>");

	}

}
