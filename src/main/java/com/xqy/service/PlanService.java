package com.xqy.service;

import com.github.pagehelper.PageInfo;
import com.xqy.entity.Plan;

public interface PlanService {

	int insert(Plan plan);

	Plan selectOneById(Integer id);

	PageInfo<Plan> select(Plan plan ,Integer pageNum,Integer pageSize);

	boolean update(Plan plan);

	int delete(Integer id);
}
