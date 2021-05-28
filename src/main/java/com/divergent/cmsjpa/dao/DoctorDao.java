package com.divergent.cmsjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.divergent.cmsjpa.entity.Doctor;

@Repository
public class DoctorDao implements DoctorDaoI {
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
    EntityManager em= emf.createEntityManager();
	@Override
	public void insertDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
    	em.persist(doctor);
    	em.getTransaction().commit();

	}
	@Override
	public List<Doctor> show() {
		// TODO Auto-generated method stub
		CriteriaQuery<Doctor> criteriaQuery = em.getCriteriaBuilder().createQuery(Doctor.class);
		@SuppressWarnings("unused")
		Root<Doctor> root = criteriaQuery.from(Doctor.class);
		return em.createQuery(criteriaQuery).getResultList();
	}
	@Override
	public void remove(Doctor doctor) {
		// TODO Auto-generated method stub
		
		em.getTransaction().begin();
    	em.remove(doctor);
    	em.getTransaction().commit();
		
	}
	@Override
	public void update(Doctor doctor) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
    	em.persist(doctor);
    	em.getTransaction().commit();
	}
	@Override
	public Doctor findById(String id) {
		// TODO Auto-generated method stub
		
		return em.find(Doctor.class, id) ;
	}
	
	
	
}
