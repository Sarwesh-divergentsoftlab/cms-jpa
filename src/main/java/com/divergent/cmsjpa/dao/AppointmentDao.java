package com.divergent.cmsjpa.dao;

//import java.sql.Statement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.divergent.cmsjpa.entity.Appointment;
import com.divergent.cmsjpa.entity.Patient;

//import com.divergentsl.cms.IDatabaseManager;
@Repository
public class AppointmentDao implements AppointmentDaoI{
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
    EntityManager em= emf.createEntityManager();
	
	@Override
	public List<Appointment> showAssignedAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> patHistory(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
    	em.persist(appointment);
    	em.getTransaction().commit();
	}

	@Override
	public List<Appointment> invoice() {
		// TODO Auto-generated method stub
		return null;
	}

}
