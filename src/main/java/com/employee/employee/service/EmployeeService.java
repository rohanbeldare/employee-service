package com.employee.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employee.client.AddressClient;
import com.employee.employee.domain.Address;
import com.employee.employee.domain.Employee;
import com.employee.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AddressClient addressClient;
	
	public List<Employee> getAll(){
		return employeeRepository.findAll();
	}
	
	public Employee getEmployee(Long employeeId){
		Employee employee = employeeRepository.getOne(employeeId);
		Address address = addressClient.getAddress(employee.getAddressId());
		employee.setAddress(address);
		return employee;
	}
	
}
