package com.myjdbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Parameters {

	public static void main(String[] args) {
		try {
Class.forName("oracle.jdbc.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dxcfs","pass");
		String sql="insert into clg values(?,?,?)";
		PreparedStatement stat=con.prepareStatement(sql);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter cid cname and sid");
		int cid=sc.nextInt();
		String cname=sc.next();
		String sid=sc.next();
	stat.setInt(1,cid);
	stat.setString(2, cname);
	stat.setString(3, sid);
	stat.executeUpdate();
	System.out.println("chill");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
