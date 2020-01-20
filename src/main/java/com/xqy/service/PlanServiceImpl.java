package com.xqy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xqy.dao.PlanDao;
import com.xqy.entity.Plan;

@Service
public class PlanServiceImpl implements PlanService {
	
	@Resource
	private PlanDao planDao;
	
	@Override
	public int insert(Plan plan) {
		return planDao.insert(plan);
	}

	@Override
	public Plan selectOneById(Integer id) {
		return planDao.selectOneById(id);
	}

	@Override
	public PageInfo<Plan> select(Plan plan,Integer pageNum,Integer pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		List<Plan> list = planDao.select(plan);
		return new PageInfo<Plan>(list) ;
	}

	@Override
	public boolean update(Plan plan) {
		return planDao.update(plan)>0;
	}

	@Override
	public int delete(Integer id) {
		return planDao.delete(id);
	}

	@Override
	public boolean deleteAll(String ids) {
		return planDao.deleteAll(ids)>0;
	}

}
