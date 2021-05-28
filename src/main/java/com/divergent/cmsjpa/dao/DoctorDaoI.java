package com.divergent.cmsjpa.dao;

import java.util.List;

import com.divergent.cmsjpa.entity.Doctor;

public interface DoctorDaoI {

void insertDoctor(Doctor doctor);
	
	List<Doctor> show();
	
	void remove(Doctor doctor);
	
	void update(Doctor doctor);
	
	Doctor findById(String id);
}
