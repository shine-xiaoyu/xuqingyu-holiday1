package com.xqy.dao;

import java.util.List;

import com.xqy.entity.Plan;

public interface PlanDao {

	int insert(Plan plan);
	
	Plan selectOneById(Integer id);
	
	List<Plan> select(Plan plan);
	
	int update(Plan plan);
	
	int delete(Integer id);
}
