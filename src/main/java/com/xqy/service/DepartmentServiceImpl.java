package com.xqy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xqy.dao.DepartmentDao;
import com.xqy.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Resource
	private DepartmentDao departmentDao;

	@Override
	public int insert(Department department) {
		return departmentDao.insert(department);
	}

	@Override
	public Department selectByName(String name) {
		return departmentDao.selectByName(name);
	}

	@Override
	public Department selectOneById(Integer id) {
		return departmentDao.selectOneById(id);
	}

	@Override
	public List<Department> select() {
		return departmentDao.select();
	}

	@Override
	public int update(Department department) {
		return departmentDao.update(department);
	}

	@Override
	public int delete(Integer id) {
		return departmentDao.delete(id);
	}
	
	

}
