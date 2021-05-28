package com.divergent.cmsjpa;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divergent.cmsjpa.entity.Doctor;
import com.divergent.cmsjpa.service.DoctorService;
import com.divergent.cmsjpa.service.DoctorServiceImpl;



@Component
public class CRUDdoctor {

		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//DoctorDao doctorDao = context.getBean("doctor_dao",DoctorDao.class);
	
	DoctorService doctorService = new DoctorServiceImpl();
	
	
  public void doctorDao() throws SQLException
  {
	  Scanner sc= new Scanner (System.in);
	
	
	System.out.println("Enter your choice");
	System.out.println("press 1 : to create doctor");
	System.out.println("press 2 : to see all doctor list");
	System.out.println("press 3 : to update doctor");
	System.out.println("press 4 : to delete doctor");
	String choice=sc.next() ;
		
		switch(choice)
		{
		case "1": //create Doctor
				doctorService.insertDoctor();
					break;
				
				
		case "2": //retrive doctor
				doctorService.show();
					break;
		case "3": //update doctor
				doctorService.updatePanel(new Doctor());
					break;
		
		case "4"://delete doctor
			
			//DoctorDao doctorDao= new DoctorDao(new DatabaseManager());
			doctorService.remove(new Doctor());
			break;
		}
		sc.close();
  }}
//		
//		public void insert()
//		{
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter doctor name");
//			String name = sc.next();
//			System.out.println("enter doctor id");
//			String doctor_id= sc.next();
//			System.out.println("enter doctor fees");
//			String fees=sc.next();
//			System.out.println("enter doctor degree");
//			String degree=sc.next();
//			System.out.println("enter doctor specialization");
//			String specialization=sc.next();
//			System.out.println("enter doctor prescription");
//			String prescription=sc.next();
//			try
//			{
//				doctorDao.insertDoctor(name,doctor_id,fees,degree,specialization,prescription);
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}
//			sc.close();
//		}
//		
//		public void retrive()throws SQLException
//		{
//			
//			//DoctorDao doctorDao= new DoctorDao(new DatabaseManager());
//			List<Map<String, Object>> list= doctorDao.showDoctor();
//			for(Map<String, Object> aDoctor : list)
//			{
//				System.out.println(aDoctor);
//			}
//			
//		}
//		
//		public void update() throws SQLException
//		{
		
		
  	
  
