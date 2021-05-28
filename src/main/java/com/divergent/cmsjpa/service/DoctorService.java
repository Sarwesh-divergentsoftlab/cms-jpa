package com.divergent.cmsjpa.service;

import java.sql.SQLException;
import java.util.List;

import com.divergent.cmsjpa.entity.Doctor;

public interface DoctorService {

	void insertDoctor();
	
	void show();
	
	void remove(Doctor doctor);
	
	void updatePanel(Doctor doctor);
	
	Doctor findById(String id);
	
	
}