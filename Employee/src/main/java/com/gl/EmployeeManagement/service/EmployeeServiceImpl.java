package com.gl.EmployeeManagement.service;




import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.EmployeeManagement.model.Employee;
import com.gl.EmployeeManagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Transactional
	public List<Employee> findAll() {

		List<Employee> employees = employeeRepository.findAll();

		return employees;
	}

	@Transactional
	public Employee findById(int id) {

		Employee employee = new Employee();

		// find record with Id from the database table
		employee = EmployeeRepository.findById(id).get();

		return employee;
	}

	@Transactional
	public void save(Employee theEmployee) {

		employeeRepository.save(theEmployee);

	}

	@Transactional
	public void deleteById(int id) {

		employeeRepository.deleteById(id);

	}

}

