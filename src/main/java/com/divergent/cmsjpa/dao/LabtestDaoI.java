package com.divergent.cmsjpa.dao;

import java.util.List;

import com.divergent.cmsjpa.entity.Labtest;

public interface LabtestDaoI {

void insertLabtest(Labtest labtest);
	
	List<Labtest> showLabtest();
	
	void update(Labtest labtest);

	Labtest findById(String id);
	
	
}
