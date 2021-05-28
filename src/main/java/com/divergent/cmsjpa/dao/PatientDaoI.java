package com.divergent.cmsjpa.dao;

import java.util.List;

import com.divergent.cmsjpa.entity.Patient;

public interface PatientDaoI {

void insertPatient(Patient patient);
	
	List<Patient> showPatient();
	
	void update(Patient patient);
	
	void deletePatient(Patient patient);
	
	Patient findById(String id);
}
