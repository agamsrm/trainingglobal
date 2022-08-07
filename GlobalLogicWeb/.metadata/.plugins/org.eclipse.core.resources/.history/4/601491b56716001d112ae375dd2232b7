package com.globallogic.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 
 */
public class Infrorm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub\
		System.out.println("I am get request inform");
		RequestDispatcher rs = request.getRequestDispatcher("/home.html");
		rs.forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		RequestDispatcher rs = request.getRequestDispatcher("/Inform.jsp");
		
		System.out.println("I am post request inform");
		
		request.setAttribute("name", name);
		request.setAttribute("password", pass);
		rs.forward(request, response);
		
	}

}
