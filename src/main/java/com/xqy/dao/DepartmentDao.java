package com.xqy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xqy.entity.Department;

public interface DepartmentDao {

	int insert(Department department);
	
	Department selectByName(@Param("name")String name);
	
	Department selectOneById(Integer id);
	
	List<Department> select();
	
	int update(Department department);
	
	int delete(Integer id);
}
