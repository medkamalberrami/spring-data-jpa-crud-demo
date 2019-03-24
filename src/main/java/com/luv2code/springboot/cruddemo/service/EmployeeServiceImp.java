package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.dao.EmployeeRepository;
import com.luv2code.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImp(EmployeeRepository theemployeeRepository) {
		this.employeeRepository = theemployeeRepository;
	}

	@Override
	@Transactional
	public List<Employee> findListAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	@Transactional
	public Employee findEmployeeById(int idEmployee) {
		return employeeRepository.findById(idEmployee).get();
	}

	@Override
	@Transactional
	public void saveEmployee(Employee theEmployee) {

		employeeRepository.save(theEmployee);

	}

	@Override
	@Transactional
	public void deleteEmployeeById(int idEmployee) {

		employeeRepository.deleteById(idEmployee);

	}

}
