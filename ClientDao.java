package com.myschool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.myschool.dbutil.DBconnection;
import com.myschool.mode.Client;

public class ClientDao 
{
	public String saveClient(Client client)
	{
	try
	{
 Connection connection=DBconnection.getConnect();
 String sql="insert into client values(?,?)";
 PreparedStatement stat=connection.prepareStatement(sql);

stat.setString(1, client.getCname());

java.util.Date dob=client.getDob();

java.sql.Date sqlDob=new java.sql.Date(dob.getTime());

//java.sql.Date sqlDob=new java.sql.Date(dob.getYear(),dob.getMonth(),dob.getDate());

stat.setDate(2, sqlDob);
 int res=stat.executeUpdate();
 if(res>0)
	 return "done bro!!!";
}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return "";
	}}
