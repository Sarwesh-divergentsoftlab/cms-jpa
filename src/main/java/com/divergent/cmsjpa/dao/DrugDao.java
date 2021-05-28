package com.divergent.cmsjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.divergent.cmsjpa.entity.Drug;


@Repository
public class DrugDao implements DrugDaoI {
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
    EntityManager em= emf.createEntityManager();

	@Override
	public void insertDrug(Drug drug) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
    	em.persist(drug);
    	em.getTransaction().commit();
	}

	@Override
	public List<Drug> showDrug() {
		// TODO Auto-generated method stub
		CriteriaQuery<Drug> criteriaQuery = em.getCriteriaBuilder().createQuery(Drug.class);
		@SuppressWarnings("unused")
		Root<Drug> root = criteriaQuery.from(Drug.class);
		return em.createQuery(criteriaQuery).getResultList();

	}

	@Override
	public void update(Drug drug) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
    	em.persist(drug);
    	em.getTransaction().commit();
	}

	@Override
	public Drug findById(String id) {
		// TODO Auto-generated method stub
		return em.find(Drug.class, id);
	}

	
	
//	IDatabaseManager databaseManager;
//	
//	public DrugDao(IDatabaseManager databaseManager) {
//		this.databaseManager=databaseManager;	
//		}
//	
//	public int insertDrug(String name,String drug_id,String drug_price) throws SQLException
//	{
////		Connection connection=databaseManager.getConnection();
////		PreparedStatement statement;
//		String sql="INSERT INTO drug (name,drug_id,drug_price) "+" VALUES("+name+","+drug_id+","+drug_price+")";
////		statement =connection.prepareStatement(sql);
////		statement.setString(1,name);
////		statement.setString(2,drug_id);
////		statement.setString(3,drug_price);
//		return jdbcTemplate.update(sql);
//		
//	}
//	
//	public List<Map<String,Object>> showDrug() throws SQLException
//	{
//		
////		Connection connection=databaseManager.getConnection();
////		Statement st=connection.createStatement();
//		String sqlretrive = "SELECT * from drug";
//		List<Map<String,Object>> list =jdbcTemplate.queryForList(sqlretrive);
//		return list;
//	}
//	
//	public int updatedrugName(String drugname,String id)throws SQLException
//	{
////		Connection connection=databaseManager.getConnection();
////		PreparedStatement statement = null;
//		String sqlupdate = "UPDATE drug SET name='"+drugname+"' WHERE drug_id='"+id+"' ";
////		statement = connection.prepareStatement(sqlupdate);
////		statement.setString(1, drugname);
////		statement.setString(2, id);
//		return jdbcTemplate.update(sqlupdate);
//	}
//	
//	public int updatedrugPrice(String price,String id)throws SQLException
//	{
////		Connection connection=databaseManager.getConnection();
////		PreparedStatement statement = null;
//		String sqlupdate = "UPDATE drug SET drug_price='"+price+"' WHERE drug_id='"+id+"' ";
//		
////		statement = connection.prepareStatement(sqlupdate);
////		statement.setString(1, price);
////		statement.setString(2, id);
//		return jdbcTemplate.update(sqlupdate);
//	}

}
