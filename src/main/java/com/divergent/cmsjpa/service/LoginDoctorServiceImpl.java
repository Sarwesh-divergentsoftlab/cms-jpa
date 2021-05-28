package com.divergent.cmsjpa.service;


import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.divergent.cmsjpa.dao.LoginDaoI;
import com.divergent.cmsjpa.entity.LoginDoctor;

@Service
public class LoginDoctorServiceImpl implements LoginDoctorService {
	
	@Autowired
	LoginDaoI loginDaoi;
	@Override
	public boolean doctorLogin() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("enter user name");
		System.out.println("Enter password");
		String user=sc.next();
		String pass= sc.next();
		LoginDoctor loginDoctor = new LoginDoctor();
		loginDoctor.setUsername(user);
		loginDoctor.setPassword(pass);
		return loginDaoi.checkDoctor(loginDoctor);
	}

}
