package com.example.Work.shift.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Work.shift.management.entity.Employee;
import com.example.Work.shift.management.repository.EmployeeRepository;

@SpringBootApplication
public class WorkShiftManagementApplication extends SpringBootServletInitializer {
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder
	application) {
	 return application.sources(WorkShiftManagementApplication.class);
	 }

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WorkShiftManagementApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
			Employee emp1 = new Employee("Trung", "Do", "0406769247", "Masto", "6-14");
			employeeRepository.save(emp1);
			
			Employee emp2 = new Employee("Jani", "Rahunen", "0458029980", "Työnjohto", "6-14");
			employeeRepository.save(emp2);
			
			Employee emp3 = new Employee("Tero", "Turen", "0406724769", "Keräily", "6-14");
			employeeRepository.save(emp3);
	}
	
	

}
