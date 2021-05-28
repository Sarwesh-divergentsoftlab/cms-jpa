package com.divergent.cmsjpa.service;

import java.util.List;

import com.divergent.cmsjpa.entity.Patient;

public interface PatientService {

	void insertPatient(Patient patient);
	
	void showPatient();
	
	void deletePatient(Patient patient);
	
	void updatePanel(Patient patient);
}
