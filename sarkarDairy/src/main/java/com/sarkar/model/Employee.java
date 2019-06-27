package com.sarkar.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_TABLE")
public class Employee {
	
	@Column(name="ID")
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "USER_NAME", nullable = true, length = 255)
	private String name;
	
	@Column(name = "USER_SALARY", nullable = true, length = 10)
	
	private long salary;
	/*
	 * public String address; private int age; private Date dob; private Date doj;
	 */
	
	
	//Default constructor
	public Employee() {
		
	}
	
	

}
