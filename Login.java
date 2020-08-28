package com.myjdbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dxcfs","pass");
		String sql="select * from regusers where uname=? and pass=?";
		PreparedStatement stat=con.prepareStatement(sql);
		
		Scanner sc=new Scanner(System.in);

System.out.println("Enter your user name and password");
		String uname=sc.next();
		String pass=sc.next();
	stat.setString(1, uname);
	stat.setString(2, pass);
	ResultSet rs=stat.executeQuery();
	if(rs.next())
	{
		System.out.println("rEcords found its true");
	}
	else
	System.out.println("go man go");	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
