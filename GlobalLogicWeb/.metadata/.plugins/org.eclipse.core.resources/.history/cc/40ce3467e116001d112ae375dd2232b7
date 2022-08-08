package com.globallogic.maven.MyMaven;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyMaven {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String un = "root";
			String up = "root";
			String url = "jdbc:mysql://localhost:3306/punyam";
			Connection con = DriverManager.getConnection(url, un, up);
			Statement st = con.createStatement();

		//	String insert = "insert into work values(220,'GlobalLogic','Management')";
		//	st.execute(insert);
		//	String update = "update work set id=109 where id= 106";
//
		//st.executeUpdate(update);
		String query = "select * from work ";
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				System.out.println("name:  "+rs.getInt("id"));
			}}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
}
