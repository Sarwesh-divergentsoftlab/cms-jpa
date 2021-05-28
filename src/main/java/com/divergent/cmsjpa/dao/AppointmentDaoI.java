package com.divergent.cmsjpa.dao;

import java.util.List;

import com.divergent.cmsjpa.entity.Appointment;
import com.divergent.cmsjpa.entity.Patient;

public interface AppointmentDaoI {

List<Appointment> showAssignedAppointment(Appointment appointment);
	
	
	
	List<Appointment> patHistory(Patient patient);
	
	void addAppointment(Appointment appointment);
	
	List<Appointment>  invoice();
}
