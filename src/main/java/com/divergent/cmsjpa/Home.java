package com.divergent.cmsjpa;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.divergent.cmsjpa.service.LoginAdminService;

@Component
public class Home {
	
	@Autowired
	LoginAdminPanel loginAdminPanel;
	
	@Autowired
	LoginDoctorPanel loginDoctorPanel;
	
	//LoginAdminPanel loginAdminPanel=new LoginAdminPanel();
		public void home()throws Exception
		{
			System.out.println("-----Welcome to clinic management system-----");
			Scanner sc= new Scanner (System.in);
			System.out.println("press 1 : Admin");
			System.out.println("Press 2 : Doctor");
			String n =sc.next();
			switch(n)
			{
			case "1":
				loginAdminPanel.checkAdmin();
				break;
			case "2":
				loginDoctorPanel.checkDoctor();
				break;
			default:
				System.out.print("enter valid input\n");
				home();
			}
			sc.close();			
		}
	}

