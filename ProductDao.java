package com.myschool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.myschool.dbutil.DBconnection;
import com.myschool.service.Product;

public class ProductDao {

	public String createProduct(Product product)
	{
		try {
			Connection connection=DBconnection.getConnect();
		    String sql="insert into product values(?,?,?,?,?,?)";
		    PreparedStatement stat=connection.prepareStatement(sql);
		    stat.setInt(1,product.getProductId());
		    stat.setString(2,product.getProductName());
		    stat.setInt(3,product.getProductPrice());
		    stat.setInt(4,product.getManfcYear());
		    stat.setString(5,product.getProductUse());
		    stat.setString(6,product.getProductContent());
		    int res=stat.executeUpdate();
		    if(res>0)
		    	return "done bro!!";
		    else
		    	return "no bro!!";
		} catch (Exception e) {
			e.printStackTrace();
			return "exception"+e;
		}
	}
	public String deleteProduct(Product product)
	{
		try {
			Connection connection=DBconnection.getConnect();
			String sql="delete from product where productId=?";
			PreparedStatement stat=connection.prepareStatement(sql);
			stat.setInt(1,product.getProductId());
			int res=stat.executeUpdate();
			if(res>0)
				return "done delete";
			else
				return "not done";
		} catch (Exception e) {
			e.printStackTrace();
			return "exception"+e;
		}	
	}
	public String displayProduct(Product product)
	{
		try {
			Connection connection=DBconnection.getConnect();
			String sql="select * from product";
			PreparedStatement stat=connection.prepareStatement(sql);
			ResultSet rs=stat.executeQuery();
			if(rs.next())
			{
				do
				{
					System.out.println(rs.getInt("productId")+" "+rs.getString("productName")+" "+rs.getInt("productPrice")+" "+rs.getInt("manfcYear")+" "+rs.getString("productUse")+" "+rs.getString("productContent"));
				}while(rs.next());
			}
			else
				System.out.println("no recs found");
		} catch (Exception e) {
			e.printStackTrace();
			return "exception"+e;
		}
		return "";
	}
}

