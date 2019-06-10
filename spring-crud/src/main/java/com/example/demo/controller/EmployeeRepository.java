package com.example.demo.controller;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.Employee;

@Transactional
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public Employee findByEmployeeId(long employeeId);
	
	@Modifying
	void deleteByEmployeeId(long employeeId);
	 
}
