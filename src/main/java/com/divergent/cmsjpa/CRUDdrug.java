package com.divergent.cmsjpa;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divergent.cmsjpa.entity.Drug;
import com.divergent.cmsjpa.service.DrugService;
import com.divergent.cmsjpa.service.DrugServiceImpl;



@Component
public class CRUDdrug {
	
//	@Autowired
//	DrugService drugDao;
	DrugService drugDao= new DrugServiceImpl();

	 	public void drugDao() throws Exception
	 	{

			Scanner sc=new Scanner (System.in);
			System.out.println("Enter your choice");
			System.out.println("press 1 : to add drug");
			System.out.println("press 2 : to see all drug list");
			System.out.println("press 3 : to update drug");
			String dchoice=sc.next() ;
				
				switch(dchoice)
				{
				case "1": //drug
						
						//DrugDao drugDao= new DrugDao(new DatabaseManager());		
						 drugDao.insertDrug(new Drug());
						break;
				
				
				case "2": //retrive drug
						//drugDao= new DrugDao(new DatabaseManager());
					drugDao.showDrug();
						break;
						
				
				case "3": //update drug
						System.out.println("enter drug Id to update details");
						drugDao.updatePanel(new Drug());
						break;
						
						
						
				default:
					System.out.print("Enter Valid choice");
					break;
				}
	
			sc.close();	
				
	 }
}
