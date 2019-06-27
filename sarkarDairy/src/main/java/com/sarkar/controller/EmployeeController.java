package com.sarkar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sarkar.model.Employee;
import com.sarkar.service.EmployeeService;

@Controller
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	
	@RequestMapping(value = "/all", method = {RequestMethod.GET, RequestMethod.POST})
	public List<Employee> getAllUsers(){
		return empService.getAllUsers();
	}
	
	
	@RequestMapping(value = "/addemployee", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	
	@ResponseBody()
	
	public Employee addNewEmployee(@RequestBody Employee emp) {
        return this.empService.addemployee(emp);
    }
}
