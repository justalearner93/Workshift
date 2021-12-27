package com.example.Work.shift.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Work.shift.management.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
