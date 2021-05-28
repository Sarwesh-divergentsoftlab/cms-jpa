
package com.divergent.cmsjpa;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divergent.cmsjpa.service.LoginAdminService;

@Component
public class LoginAdminPanel {
	
	
	
	@Autowired
	LoginAdminService loginAdminService;
	
	@Autowired
	AdminPanel admin;
	
	public void checkAdmin() throws Exception { 

		try {
		//	Console c= System.console();
		//	if(c==null)
		//		System.err.print("c is null");
			Scanner sc= new Scanner (System.in);
		//	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
			//LoginDao loginDao = context.getBean(LoginDao.class);
			//LoginDao ado=new LoginDao(new DatabaseManager());
			 
		
			boolean flag=loginAdminService.adminLogin();
			if(flag)
			{
					System.out.println("Login successful\n");
					admin.adminPanel();
			}
			if(!flag)
			{
				System.out.println("your password or username may be incorrect\n");
				
				checkAdmin();
			}
		sc.close();
		}
		catch(SQLException ex)
			{
				ex.printStackTrace();
			}
	}

}
