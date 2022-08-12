package com.springdemo.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.employee.model.employeemaster;
import com.springdemo.employee.repository.employeemasterrepository;

@RestController
@RequestMapping("/empcontroller")
public class employeemastercontroller {
	
	@Autowired
	employeemasterrepository repo;
	
	@PostMapping("/saveempdata")
	public String saveEmpData(@RequestBody employeemaster emp) {
		try {
		repo.save(emp);
		return "Success";
		}catch(Exception ee) {
			ee.printStackTrace();
			return ee.toString();
		}
	}
	
	@GetMapping("/getdata")
	public List<employeemaster> getdata() {
		List<employeemaster> list=new ArrayList<>();
		try {
		list =(List<employeemaster>)repo.findAll();		
		}catch(Exception ee) {
			ee.printStackTrace();
		}
		return list;
	}
	
	@PutMapping("/updateEmpData")
	public String updateEmpData(@RequestBody employeemaster emp) {
		try {
		repo.save(emp);
		return "Success";
		}catch(Exception ee) {
			ee.printStackTrace();
			return ee.toString();
		}
	}
	
	@DeleteMapping("/deleteemp")
	public String deleteemp(@RequestBody employeemaster emp) {
		try {
		repo.deleteById(emp.getId());
		return "Success";
		}catch(Exception ee) {
			ee.printStackTrace();
			return ee.toString();
		}
	}
	

}


