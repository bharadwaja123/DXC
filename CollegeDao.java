package com.myschool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.myschool.dbutil.DBconnection;
import com.myschool.mode.college;

public class CollegeDao {

	public String createCollege(college col)
	{
		try {
			Connection con=DBconnection.getConnect();
			String sql="insert into clg values(?,?,?)";
			PreparedStatement stat=con.prepareStatement(sql);
		stat.setInt(1,col.getCid());
		stat.setString(2,col.getCname());
		stat.setString(3,col.getSid());
		int res=stat.executeUpdate();
		if(res>0)
			return "done bro";
		else
			return "not done";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "exception"+e;
		}
		
	}
}
