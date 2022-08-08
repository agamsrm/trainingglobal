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
			String url = "jdbc:mysql://localhost:3306/agam";
			Connection con = DriverManager.getConnection(url, un, up);
			Statement st = con.createStatement();

			String query = "select * from emp ";
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				System.out.println("id:  " + rs.getInt("id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
