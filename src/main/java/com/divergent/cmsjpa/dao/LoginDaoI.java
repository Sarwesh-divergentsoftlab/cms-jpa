package com.divergent.cmsjpa.dao;

import com.divergent.cmsjpa.entity.LoginAdmin;
import com.divergent.cmsjpa.entity.LoginDoctor;

public interface LoginDaoI {
	
	boolean checkAdmin(LoginAdmin loginAdmin);
	
	boolean checkDoctor(LoginDoctor loginDoctor);
		

}
