package com.divergent.cmsjpa;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.divergent.cmsjpa.entity.Labtest;
import com.divergent.cmsjpa.service.LabtestService;
import com.divergent.cmsjpa.service.LabtestServiceImpl;

@Component
public class CRUDlabtest {
	@Autowired
	AnnotationConfigApplicationContext context ;
//	@Autowired
//	LabtestService labtestDao;
	
	LabtestService labtestDao =new LabtestServiceImpl();
	public void labtestDao()throws Exception
	{

	Scanner sc= new Scanner(System.in);	
	System.out.println("Enter your choice");
	System.out.println("press 1 : to add lab test details");
	System.out.println("press 2 : to see all lab test list");
	System.out.println("press 3 : to update test");
	String lchoice=sc.next();
		
		switch(lchoice)
		{
		case "1": //labtest
				//LabtestDao labtestDao= new LabtestDao(new DatabaseManager());
				labtestDao.insertLabtest(new Labtest());						
				break;
		
		
		case "2": //retrive labtest
				//labtestDao= new LabtestDao(new DatabaseManager());
			labtestDao.showLabtest();
				break;
				
		
		case "3": //update price
				labtestDao.updatePanel(new Labtest());
				
				
			}
	sc.close();
	}
}
