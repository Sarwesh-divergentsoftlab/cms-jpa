package com.divergent.cmsjpa.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.divergent.cmsjpa.dao.LoginDaoI;
import com.divergent.cmsjpa.entity.LoginAdmin;
@Service
public class LoginAdminServiceImpl implements LoginAdminService {

	
	@Autowired 
	LoginDaoI ldi;
	
	
	@Override
	public boolean adminLogin() {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter user name");
		System.out.println("Enter password");
		String user=sc.next();
		String pass= sc.next();
        LoginAdmin lao = new LoginAdmin();
		lao.setUsername(user);
		lao.setPassword(pass);
		return ldi.checkAdmin(lao);
	}

}
