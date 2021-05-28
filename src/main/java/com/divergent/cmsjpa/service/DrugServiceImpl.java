package com.divergent.cmsjpa.service;

import java.util.Scanner;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.divergent.cmsjpa.dao.DrugDao;
import com.divergent.cmsjpa.dao.DrugDaoI;
import com.divergent.cmsjpa.entity.Drug;
@Service
public class DrugServiceImpl implements DrugService{

//	@Autowired
//	private DrugDaoI drugDaoi;
	DrugDaoI drugDaoI =new DrugDao(); 
	Scanner sc = new Scanner(System.in);
	@Transactional
	@Override
	public void insertDrug(Drug drug) {
		// TODO Auto-generated method stub

		System.out.println("enter drug name");
		String name = sc.next();
		System.out.println("enter drug id");
		String drug_id= sc.next();
		System.out.println("enter drug price");
		String drug_price=sc.next();
		drug.setName(name);
		drug.setDrug_id(drug_id);
		drug.setDrug_price(drug_price);
		drugDaoI.insertDrug(drug);
	}

	@Override
	public void showDrug() {
		// TODO Auto-generated method stub
		System.out.println(drugDaoI.showDrug());
	}
	
	public Drug findById(String id) {
		// TODO Auto-generated method stub
		return drugDaoI.findById(id);
	}


	@Override
	public void updatePanel(Drug drug) {
		// TODO Auto-generated method stub
 
		System.out.println("enter choice");
		System.out.println("press 1 : to update name");
		System.out.println("press 2 : to update drug price");
		
		String n=sc.next();
			switch(n)
			{
			case "1":
				
				System.out.println("enter id to update name");
				
				//DrugDao drugDaon= new DrugDao(new DatabaseManager());
				updateDrugName(new Drug());
				//if(rowupdatename>0) System.out.print("information updated");
				break;
			
			case "2":
				System.out.println("enter id to update price");
				
				//drugDaon= new DrugDao(new DatabaseManager());
				updateDrugPrice(new Drug());
				//if(rowupdatespec>0) System.out.print("information updated");
				break;
			
			default:
				System.out.println("Enter Valid choice");

				break;
			}	
	
	}
	
	void updateDrugName(Drug drug) {
		 String id = sc.next();
	        System.out.println("enter updated drug name");
	        String name=sc.next();
			drug = findById(id);
			drug.setDrug_id(id);
			drug.setName(name);
			drugDaoI.update(drug);
	}
	void updateDrugPrice(Drug drug)
	{
        String id = sc.next();
        System.out.println("enter updated drug price");
        String price=sc.next();
		drug = findById(id);
		drug.setDrug_id(id);
		drug.setDrug_price(price);
		drugDaoI.update(drug);
	}

	
		
	}
