package com.divergent.cmsjpa.dao;

import java.util.List;

import com.divergent.cmsjpa.entity.Drug;

public interface DrugDaoI {

	void insertDrug(Drug drug);
	
	List<Drug> showDrug();
	
	void update(Drug drug);

	Drug findById(String id);
	

}
