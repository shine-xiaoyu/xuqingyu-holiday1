package com.xqy.service;

import java.util.List;

import com.xqy.entity.Department;

public interface DepartmentService {

	int insert(Department department);
	
	Department selectByName(String name);

	Department selectOneById(Integer id);

	List<Department> select();

	int update(Department department);

	int delete(Integer id);
}
