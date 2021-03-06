package com.divergent.cmsjpa.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.divergent.cmsjpa.entity.Patient;




@Repository
public class PatientDao implements PatientDaoI {
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
    EntityManager em= emf.createEntityManager();


	@Override
	public void insertPatient(Patient patient) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
    	em.persist(patient);
    	em.getTransaction().commit();
	}



	@Override
	public void deletePatient(Patient patient) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
    	em.remove(patient);
    	em.getTransaction().commit();
	}

	@Override
	public List<Patient> showPatient() {
		// TODO Auto-generated method stub
		
		CriteriaQuery<Patient> criteriaQuery = em.getCriteriaBuilder().createQuery(Patient.class);
		@SuppressWarnings("unused")
		Root<Patient> root = criteriaQuery.from(Patient.class);
		return em.createQuery(criteriaQuery).getResultList();
	}

	@Override
	public Patient findById(String id) {
		// TODO Auto-generated method stub
		return em.find(Patient.class, id);
	}

	@Override
	public void update(Patient patient) {
		
		em.getTransaction().begin();
    	em.persist(patient);
    	em.getTransaction().commit();
	}
}
