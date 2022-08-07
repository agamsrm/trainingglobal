package com.globallogic.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/home")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void destroy() {
	
		System.out.println("Destroying");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servicing");
		RequestDispatcher rd=request.getRequestDispatcher("/home.html");
		rd.forward(request, response);
		
	}

	

	
}
