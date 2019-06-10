package com.example.demo.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employee")
@Data
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "employee_id")
	private long employeeId;
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Column(name = "employee_username")
	private String employeeUsername;
	
	@Column(name = "employee_password")
	private String employeePassword;
	
	@Column(name = "employee_email")
	private String employeeEmail;
	
}
