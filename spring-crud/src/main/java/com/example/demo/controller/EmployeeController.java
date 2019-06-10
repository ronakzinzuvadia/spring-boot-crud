package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.vo.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository; 
	
	List<Employee> employees;
	
	@RequestMapping("/")
	public ModelAndView listEmployee() {
		ModelAndView view = new ModelAndView("employee/employee");
		employees = employeeRepository.findAll();
		view.addObject("employees", employees);
		return view;
	}
	
	@RequestMapping("/employee/new")
	public ModelAndView newEmployee() {
		ModelAndView view = new ModelAndView("employee/employee-new");
		view.addObject("employeeUrl", "/employee/create");
		view.addObject("employee", new Employee());
		return view;
	}
	
	@RequestMapping("/employee/create")
	public String createEmployee(@ModelAttribute("employeeVo") Employee employee, BindingResult bindingResult) {
		employeeRepository.save(employee);
		return "redirect:/";
	}
	
	@RequestMapping("/employee/{employeeId}/edit")
	public ModelAndView editEmployee(@PathVariable("employeeId") long employeeId) {
		ModelAndView view = new ModelAndView("employee/employee-new");
		view.addObject("employeeUrl", "/employee/create");
		Employee employee = employeeRepository.findByEmployeeId(employeeId);
		view.addObject("employee", employee);
		return view;
	}
	
	@RequestMapping("employee/{employeeId}/delete")
	public String deleteEmployee(@PathVariable("employeeId") long employeeId) {
		employeeRepository.deleteByEmployeeId(employeeId);
		return "redirect:/";
	}

}
