package com.sarkar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarkar.dao.EmployeeDao;
import com.sarkar.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao empDao;
	
	public List<Employee> getAllUsers(){
		return this.empDao.findAll();
		
	}
	
	public Employee addemployee(Employee emp){
		return this.empDao.save(emp);
	}

}
