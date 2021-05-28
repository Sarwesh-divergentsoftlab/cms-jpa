package com.divergent.cmsjpa.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.divergent.cmsjpa.dao.DoctorDao;
import com.divergent.cmsjpa.dao.DoctorDaoI;
import com.divergent.cmsjpa.entity.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {
//	@Autowired
//	 DoctorDaoI doctorDoai;
	DoctorDaoI doctorDaoi = new DoctorDao();
	Doctor doctor = new Doctor();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void insertDoctor() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter doctor name");
		String name = sc.next();
		System.out.println("enter doctor id");
		String doctor_id = sc.next();
		System.out.println("enter doctor fees");
		String fees = sc.next();
		System.out.println("enter doctor degree");
		String degree = sc.next();
		System.out.println("enter doctor specialization");
		String specialization = sc.next();
		System.out.println("enter doctor prescription");
		String prescription = sc.next();
		doctor.setDegree(degree);
		doctor.setDoctor_id(doctor_id);
		doctor.setFees(fees);
		doctor.setName(name);
		doctor.setPrescription(prescription);
		doctor.setSpecializatio(specialization);
		
		doctorDaoi.insertDoctor(doctor);
		sc.close();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println(doctorDaoi.show());
		
	}

	@Override
	public void remove(Doctor del) {
		// TODO Auto-generated method stub
		System.out.println("enter doctor id to delete");
		String id=sc.next();
		del = findById(id);
		System.out.println(del);
		del.getDoctor_id();
		doctorDaoi.remove(del);
	}

	@Override
	public void updatePanel(Doctor doctor) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter choice");
		System.out.println("press 1 : to update name");
		System.out.println("press 2 : to update specialization");
		System.out.println("press 3 : to update fees");
		System.out.println("press 4 : to update degree");
		System.out.println("press 5 : to update prescription");
		String n=sc.next();
			switch(n)
			{
			case "1":
				System.out.println("enter id to updated name");
			//	DoctorDao doctorDao= new DoctorDao(new DatabaseManager());
				
				updateName(new Doctor());
				//if(rowupdatename>0) System.out.print("information updated");
				break;
			
			case "2":
			
				System.out.println("enter id to updated specialization");
				
			//	doctorDao= new DoctorDao(new DatabaseManager());
				updateSpecialization(new Doctor());
				//if(rowupdatespec>0) System.out.print("information updated");
				break;
			
			case "3":
				System.out.println("enter id to updated fees");
		
			//	doctorDao= new DoctorDao(new DatabaseManager());
				updateFees(new Doctor());
			//	if(rowupdatefees>0) System.out.print("information updated");
				break;
			
			case "4":
				
				System.out.println("enter id to updated degree");
				
			//	doctorDao= new DoctorDao(new DatabaseManager());
				updateDegree(new Doctor());
			//	if(rowupdatedegree>0) System.out.print("information updated");
				break;
			
			case "5":	
				
				System.out.println("enter id to updated prescrip[tion");
				
			//	doctorDao= new DoctorDao(new DatabaseManager());
				updatePrescription(new Doctor());
			//	if(rowupdate>0) System.out.print("information updated");
				break;
			
					default:
						System.out.println("Enter Valid choice");
			}
		sc.close();
	}

	@Override
	public Doctor findById(String id) {
		// TODO Auto-generated method stub
		return doctorDaoi.findById(id);
	}

	
	public void updateName(Doctor name) {
		// TODO Auto-generated method stub
		String id=sc.next();
		name = findById(id);
		System.out.println("enter updated name");
		String dname=sc.next();
		name.setDoctor_id(id);
		name.setName(dname);
		doctorDaoi.update(name);
		updatePanel(new Doctor());
		
	}

	
	public void updateSpecialization(Doctor name) {
		// TODO Auto-generated method stub
		String id=sc.next();
		name = findById(id);
		System.out.println("enter updated specialization");
		String dspec=sc.next();
		name.setDoctor_id(id);
		name.setSpecializatio(dspec);
		doctorDaoi.update(name);
		updatePanel(new Doctor());
	}

	
	public void updateFees(Doctor name) {
		// TODO Auto-generated method stub
		String id=sc.next();
		name = findById(id);
		System.out.println("enter updated fees");
		String dfees=sc.next();
		name.setDoctor_id(id);
		name.setFees(dfees);
		doctorDaoi.update(name);
		updatePanel(new Doctor());
		
	}

	
	public void updateDegree(Doctor name) {
		// TODO Auto-generated method stub
		String id=sc.next();
		name = findById(id);
		System.out.println("enter updated degree");
		String ddegree=sc.next();
		name.setDoctor_id(id);
		name.setDegree(ddegree);
		doctorDaoi.update(name);
		updatePanel(new Doctor());
	}

	
	public void updatePrescription(Doctor name) {
		// TODO Auto-generated method stub
		String id=sc.next();
		name = findById(id);
		System.out.println("enter updated specialization");
		String dpres=sc.next();
		name.setDoctor_id(id);
		name.setPrescription(dpres);
		doctorDaoi.update(name);
		updatePanel(new Doctor());
	}
	

}
