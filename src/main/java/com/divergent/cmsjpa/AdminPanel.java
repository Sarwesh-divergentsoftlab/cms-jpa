package com.divergent.cmsjpa;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class AdminPanel {
	

	CRUDdoctor doctor = new CRUDdoctor();
	
	
	CRUDdrug drug = new CRUDdrug();
	
	
	CRUDlabtest labtest= new CRUDlabtest();
	
	CRUDpatient patient =new CRUDpatient();
	
	LoginAdminPanel login = new LoginAdminPanel();
	
	AppointmentOp apoint = new AppointmentOp();
	

	public void adminPanel() throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("welcome to admin panel");

System.out.println("press 1 : doctor manager");
System.out.println("press 2 : patient manager");
System.out.println("press 3 : drug manager");
System.out.println("press 4 : labtest manager");
System.out.println("press 5 : make appointment");
System.out.println("press 6 : logout");
String c=sc.next();
		
		switch(c)
		{
				case "1"://doctor manager
				 // CRUDdoctor.doctorDao();
				  doctor.doctorDao();
				  break;
					
					
					
		case "2": //patient manager
				//CRUDpatient.patientDao();
				patient.patientDao();
				break;
		
		case "3": //DRUG manager
				//CRUDdrug.drugDao();
				drug.drugDao();
				break;
			
				
				
				
		case "4": //labtest manager
				//CRUDlabtest.labtestDao();
				labtest.labtestDao();
				break;
			

		case "5"://appointment
			apoint.addAppointment();
				break;
		
		case "6"://logout
			//LoginAdmin.checkAdmin();
			login.checkAdmin();	
				default:
					System.out.print("Enter Valid choice");
					adminPanel();
					break;
				}
		
		sc.close();
		
}
}
 