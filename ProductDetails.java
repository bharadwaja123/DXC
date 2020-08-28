package com.myschool.dao;

import com.myschool.service.Product;

public class ProductDetails {

	public static void main(String[] args) {
		Product product=new  Product(21,"adidas",2000,2014,"walk","shoes");
		ProductDao dao=new ProductDao();
		System.out.println(dao.createProduct(product));
      System.out.println(dao.deleteProduct(product));
      System.out.println(dao.displayProduct(product));
	}

}
