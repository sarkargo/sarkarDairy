package com.sarkar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String userId;
	private String password;
	private String securityQuestion;
	private String numberOfAttempt;
	
	//default constructor.
	public User() {
		
	}
	public User(String userId, String password) {
		
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getNumberOfAttempt() {
		return numberOfAttempt;
	}
	public void setNumberOfAttempt(String numberOfAttempt) {
		this.numberOfAttempt = numberOfAttempt;
	}
	
	

}
