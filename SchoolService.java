package com.myschool.service;

import com.myschool.dao.CollegeDao;
import com.myschool.mode.college;

public class SchoolService {

	public static void main(String[] args) {
    college coll=new college(21,"bihar unv","2");
    CollegeDao coll1=new CollegeDao();
    System.out.println(coll1.createCollege(coll));
	}

}
