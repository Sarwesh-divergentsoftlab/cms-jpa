package com.divergent.cmsjpa.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.divergent.cmsjpa.entity.Appointment;
import com.divergent.cmsjpa.entity.Patient;


public interface AppointmentService {
	
	void showAssignedAppointment(Appointment appointment);
	
	void addPrescription(Patient patient);
	
	void patHistory(Patient patient);
	
	void addAppointment(Appointment appointment);
	
	void  invoice();

}
