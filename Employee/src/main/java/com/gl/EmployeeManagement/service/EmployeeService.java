package com.gl.EmployeeManagement.service;

import java.util.List;

import com.gl.EmployeeManagement.model.Employee;

public interface EmployeeService {
	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

}
