package com.cognizant.ormlearn.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.repository.DepartmentRepositary;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepositary departmentRepositary;
	@Transactional
	public Department get(int id) {
		Optional<Department> departments = departmentRepositary.findById(id);
		if(!departments.isPresent())
			return null;
		return departments.get();
	}
	@Transactional
	public void save(Department department)
	{
		departmentRepositary.save(department);
	}
}
