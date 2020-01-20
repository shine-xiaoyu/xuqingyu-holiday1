package com.xqy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.xqy.entity.Department;
import com.xqy.entity.Plan;
import com.xqy.service.DepartmentService;
import com.xqy.service.PlanService;

@Controller
public class PlanController {

	@Resource
	private PlanService planService;
	@Resource
	private DepartmentService departmentService;
	
	@RequestMapping("/")
	public String select (Model m ,Plan plan,
			@RequestParam(defaultValue = "1")Integer pageNum,
			@RequestParam(defaultValue = "2")Integer pageSize) {
		PageInfo<Plan> info = planService.select(plan,pageNum, pageSize);
		m.addAttribute("info", info);
		m.addAttribute("plan", plan);
		return "list";
	}
	
	
	@RequestMapping("/selectOne")
	public String selectOne(Integer id,Model m) {
		System.out.println(id);
		Plan plan = planService.selectOneById(id);
		m.addAttribute("plan", plan);
		return "OnePlan";
	}
	
	
	@GetMapping("/update")
	public String toupdate(Integer id,Model m) {
		Plan plan = planService.selectOneById(id);
		m.addAttribute("plan", plan);
		return "update";
	}

	
	@GetMapping("/getdepartment")
	public @ResponseBody List<Department> getdepartment(){
		List<Department> list = departmentService.select();
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/doupdate")
	public boolean doupdate(Plan plan) {
		System.out.println(plan);
		
		
		return planService.update(plan);
	}
	
	@ResponseBody
	@RequestMapping("/deleteAll")
	public boolean deleteAll(String ids) {
		
		return planService.deleteAll(ids);
	}
	
	
}
