package com.employee.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.domain.Employee;
import com.employee.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
private EmployeeService employeeService;
	
	
	@GetMapping(path = "/getAll")
	public List<Employee> getEmployees(){
		return employeeService.getAll();
	}
	
	@GetMapping(path = "/getEmployee/{employeeId}")
	public Employee getEmployee(@PathVariable Long employeeId){
		return employeeService.getEmployee(employeeId);
	}
	
}
