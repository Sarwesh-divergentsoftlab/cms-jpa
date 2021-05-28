package com.divergent.cmsjpa;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.divergent.cmsjpa.entity.Patient;
import com.divergent.cmsjpa.service.PatientService;
import com.divergent.cmsjpa.service.PatientServiceImpl;



@Component
public class CRUDpatient {
	@Autowired
	ApplicationContext context ;

//	@Autowired
//	PatientService patientDao;
	PatientService patientDao=new PatientServiceImpl();
	
	public void patientDao() throws Exception
	{

	  Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter your choice");
		System.out.println("press 1 : to add patient");
		System.out.println("press 2 : to see all patient list");
		System.out.println("press 3 : to update patient");
		System.out.println("press 4 : to delete patient");
		String pchoice=sc.next() ;
			
			switch(pchoice)
			{
			case "1": //create patient
		
				//	PatientDao patientDao= new PatientDao(new DatabaseManager());
					patientDao.insertPatient(new Patient());
				//	if(r!=0)System.out.print("information added\n");
					//patientDao();
					break;
			
			
			case "2": //retrive patient
				//	patientDao= new PatientDao(new DatabaseManager());
					patientDao.showPatient();
					patientDao();
					break;
					
			
			case "3": //update patient
					
					patientDao.updatePanel(new Patient());			
					break;
					
			case "4"://delete patient
			//	patientDao= new PatientDao(new DatabaseManager());
				patientDao.deletePatient(new Patient());
//				if() System.out.print("patient not found");
//				else {
//					System.out.print("patient information deleted\n");
//					patientDao();
//				}
				break;
			default:
				System.out.print("Enter Valid choice");
			}

	sc.close();
	}
}
