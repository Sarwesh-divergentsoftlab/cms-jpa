package com.divergent.cmsjpa.dao;

//import java.sql.Statement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.divergent.cmsjpa.entity.Labtest;

//import com.divergentsl.cms.IDatabaseManager;


@Repository
public class LabtestDao implements LabtestDaoI {
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
    EntityManager em= emf.createEntityManager();
	

	@Override
	public void insertLabtest(Labtest labtest) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
    	em.persist(labtest);
    	em.getTransaction().commit();
	}

	@Override
	public List<Labtest> showLabtest() {
		// TODO Auto-generated method stub
		
		CriteriaQuery<Labtest> criteriaQuery = em.getCriteriaBuilder().createQuery(Labtest.class);
		@SuppressWarnings("unused")
		Root<Labtest> root = criteriaQuery.from(Labtest.class);
		return em.createQuery(criteriaQuery).getResultList();
		
	}

	@Override
	public void update(Labtest labtest) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
    	em.persist(labtest);
    	em.getTransaction().commit();
	}
	@Override
	public Labtest findById(String id) {
		// TODO Auto-generated method stub
		return em.find(Labtest.class, id);
	}


}
