package com.cognizant.ormlearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.EmployeeRepositary;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepositary employeeRepositary;
	@Transactional
	public Employee get(int id) {
		Optional<Employee> employees = employeeRepositary.findById(id);
		if(!employees.isPresent())
			return null;
		return employees.get();
	}
	@Transactional
	public void save(Employee employee) {
		employeeRepositary.save(employee);
	}
	@Transactional
	public List<Employee> getAllPermanentEmployees(){
		return employeeRepositary.getAllPermanentEmployees();
	}
	@Transactional
	public double getAvgSalary(int dept) {
		return employeeRepositary.getAverageSalary(dept);
	}
	public List<Employee> getAllEmployeesNative(){
		return employeeRepositary.getAllEmployeesNative();
	}
}
