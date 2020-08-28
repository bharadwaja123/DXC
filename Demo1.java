package com.myjdbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo1 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dxcfs","pass");
		String sql="insert into clg values('22','MGU','0')";

			PreparedStatement stat=con.prepareStatement(sql);

			stat.executeUpdate();
			System.out.println("done bro!!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
