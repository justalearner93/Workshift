package com.example.Work.shift.management.service;
import java.util.*;

import com.example.Work.shift.management.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	Employee getEmployeeById(Long id);
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);

	
	
}
