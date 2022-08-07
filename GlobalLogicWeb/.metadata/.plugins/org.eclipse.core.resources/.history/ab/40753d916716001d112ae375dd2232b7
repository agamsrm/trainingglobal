package com.globallogic.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void destroy() {

		System.out.println("Destroying Servlet");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("I am get request");

		RequestDispatcher rs = request.getRequestDispatcher("/home.html");
		rs.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			String un = "root";
//			String up = "root";
//			String url = "jdbc:mysql://localhost:3306/punyam";
//			Connection con = DriverManager.getConnection(url, un, up);
//			Statement st = con.createStatement();
//
//			String insert = "insert into work values(220,'GlobalLogic','Management')";
//			st.execute(insert);
//		//	String update = "update work set id=109 where id= 106";
////
//		//st.executeUpdate(update);
//		String query = "select * from work ";
//			ResultSet rs = st.executeQuery(query);
//			while (rs.next()) {
//				System.out.println("name:  "+rs.getInt("id"));
//			}}
//			catch(Exception e) {
//				e.printStackTrace();
//			}
		System.out.println("I am Posting Request");
		
		doGet(request, response);
	}

}
