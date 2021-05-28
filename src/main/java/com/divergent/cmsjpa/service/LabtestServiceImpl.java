package com.divergent.cmsjpa.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.divergent.cmsjpa.dao.LabtestDao;
import com.divergent.cmsjpa.dao.LabtestDaoI;
import com.divergent.cmsjpa.entity.Labtest;
@Service
public class LabtestServiceImpl implements LabtestService{

//	@Autowired
//	private LabtestDaoI labtestDaoi;
	
	LabtestDaoI labtestDaoi = new LabtestDao();
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void insertLabtest(Labtest labtest) {
		// TODO Auto-generated method stub
		System.out.println("enter labtest name");
		String name = sc.next();
		System.out.println("enter labtest id");
		String drug_id= sc.next();
		System.out.println("enter test price");
		String drug_price=sc.next();
		labtest.setName(name);
		labtest.setLabtest_price(drug_price);
		labtest.setLabtest_id(drug_id);
				
		labtestDaoi.insertLabtest(labtest);
	}

	@Override
	public void showLabtest() {
		// TODO Auto-generated method stub
		System.out.println(labtestDaoi.showLabtest());
	}

	
	public void updateName(Labtest labtest) {
		// TODO Auto-generated method stub
		String id = sc.next();
        System.out.println("enter updated labtet name");
        String name=sc.next();
		labtest = findById(id);
		labtest.setLabtest_id(id);
		labtest.setName(name);
		labtestDaoi.update(labtest);
	}
	
	public Labtest findById(String id) {
		// TODO Auto-generated method stub
		return labtestDaoi.findById(id);
	}

	
	public void updatePrice(Labtest labtest) {
		// TODO Auto-generated method stub
		String id = sc.next();
        System.out.println("enter updated labtet price");
        String name=sc.next();
		labtest = findById(id);
		labtest.setLabtest_id(id);
		labtest.setLabtest_price(name);
		labtestDaoi.update(labtest);
	}

	@Override
	public void updatePanel(Labtest labtest) {
		// TODO Auto-generated method stub
		System.out.println("enter choice");
		System.out.println("press 1 : to update name");
		System.out.println("press 2 : to update labtest price");
		
		String n=sc.next();
			switch(n)
			{
			case "1":
				
				System.out.println("enter id to update labtest name");
				//labtestDao= new LabtestDao(new DatabaseManager());
				updateName(new Labtest());
				//if(rowupdatename>0) System.out.print("information updated");
				break;
			
			case "2":
				System.out.println("enter id to update labtest price");
				//labtestDao= new LabtestDao(new DatabaseManager());
				updatePrice(new Labtest());
				//if(rowupdatespec>0) System.out.print("information updated");
				break;
			
			default:
				System.out.println("Enter Valid choice");
			}	
		
	}

	
}
