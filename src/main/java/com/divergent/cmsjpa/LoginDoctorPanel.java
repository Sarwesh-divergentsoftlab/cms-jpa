package com.divergent.cmsjpa;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.divergent.cmsjpa.entity.LoginDoctor;
import com.divergent.cmsjpa.service.LoginDoctorService;



@Component
public class LoginDoctorPanel {
	@Autowired
	LoginDoctorService loginDoctorService;
	@Autowired
	LoginDoctor doc;
	@Autowired
	DoctorPanel doctorPanel;
	public void checkDoctor() throws SQLException
	{
		System.out.println("in logdpa");
		 boolean f=loginDoctorService.doctorLogin();
		    if(f)
		     {
		     
		    	System.out.println("login success");
		    	doctorPanel.doctorPanel(doc.getUsername());
		     
		     }
		    else System.out.println("login doctor fail");
	}

		
	}


