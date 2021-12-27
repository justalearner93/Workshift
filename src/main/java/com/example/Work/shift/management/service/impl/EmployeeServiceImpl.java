package com.example.Work.shift.management.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Work.shift.management.entity.Employee;
import com.example.Work.shift.management.repository.EmployeeRepository;
import com.example.Work.shift.management.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
		
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}


	@Override
	public Employee getEmployeeById(Long id) {
		
		return employeeRepository.findById(id).get();
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}


	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
		
	}

}
