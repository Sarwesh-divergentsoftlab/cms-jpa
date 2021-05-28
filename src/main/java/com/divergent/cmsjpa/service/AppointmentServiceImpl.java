package com.divergent.cmsjpa.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divergent.cmsjpa.dao.AppointmentDao;
import com.divergent.cmsjpa.dao.AppointmentDaoI;
import com.divergent.cmsjpa.dao.PatientDao;
import com.divergent.cmsjpa.dao.PatientDaoI;
import com.divergent.cmsjpa.entity.Appointment;
import com.divergent.cmsjpa.entity.Patient;
@Service
public class AppointmentServiceImpl implements AppointmentService {

	
//	@Autowired
//	private AppointmentDaoI appointmentDao;
	AppointmentDaoI appointmentDao = new AppointmentDao();
	
	PatientDaoI patientDaoi = new PatientDao();
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void showAssignedAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		 System.out.println(appointmentDao.showAssignedAppointment(appointment));
	}

	@Override
	public void addPrescription(Patient appointment) {
		// TODO Auto-generated method stub
		System.out.println("enter patient id to prescribe");
		String id = sc.next();
        System.out.println("enter prescription and notes");
        String name=sc.next();
		appointment = findById(id);
		appointment.setPatient_id(id);
		appointment.setPrescription(name);
		patientDaoi.update(appointment);
		
	}
	public Patient findById(String id) {
		// TODO Auto-generated method stub
		return patientDaoi.findById(id);
	}

	@Override
	public void patHistory(Patient patient) {
		// TODO Auto-generated method stub
		 appointmentDao.patHistory(patient);
	}

	@Override
	public void addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter appointment id");
		String appid = sc.next();
		System.out.println("enter patient id");
		String pid = sc.next();
		System.out.println("enter doctor id");
		String did = sc.next();
		System.out.println("enter problem");
		String problem = sc.next();
		System.out.println("enter appointment date");
		String date = sc.next();
		System.out.println("enter time");
		String time = sc.next();
		
		appointment.setApp_date(date);
		appointment.setAppointment_id(appid);
		appointment.setPatient_id(pid);
		appointment.setProblem(problem);
		appointment.setTime(time);
		appointment.setDoctor_id(did);
		appointmentDao.addAppointment(appointment);
	}

	@Override
	public void invoice() {
		// TODO Auto-generated method stub
		 appointmentDao.invoice();
	}

}
