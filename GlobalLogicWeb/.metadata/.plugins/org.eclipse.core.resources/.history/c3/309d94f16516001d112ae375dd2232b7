package com.globallogic.hello;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyMavenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servicing");
		RequestDispatcher rd=request.getRequestDispatcher("/home.html");
		rd.forward(request, response);
		
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroying");
	}

	
	
}
