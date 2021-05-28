package com.divergent.cmsjpa;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.divergent.cmsjpa.entity.Appointment;
import com.divergent.cmsjpa.entity.Patient;
import com.divergent.cmsjpa.service.AppointmentService;
import com.divergent.cmsjpa.service.AppointmentServiceImpl;
import com.divergent.cmsjpa.service.PatientService;

@Component
public class AppointmentOp {

	ApplicationContext context;

	@Autowired
	PatientService patientService;

//	@Autowired
//	AppointmentService appointmentService;
	AppointmentService appointmentService = new AppointmentServiceImpl();

	public void listPatient() {

		patientService.showPatient();

	}

	public void assignedAppointment(String dId) throws SQLException {

		appointmentService.showAssignedAppointment(new Appointment());

//			
//			for(Map<String, Object> aDoctor : list)
//			{
//				System.out.println(aDoctor);
//			}

	}

	public void addPrescription() throws SQLException {

		
		appointmentService.addPrescription(new Patient());

	}

	public void patientHistory() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter patient id to see full description");
		String pId = sc.next();
		appointmentService.patHistory(new Patient());
	}

	public void addAppointment() {


		appointmentService.addAppointment(new Appointment());

	}

	public void generateInvoice() throws SQLException {
		appointmentService.invoice();
	}

}
