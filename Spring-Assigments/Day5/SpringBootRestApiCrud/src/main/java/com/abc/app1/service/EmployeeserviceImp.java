package com.abc.app1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.app1.model.Employee;
import com.abc.app1.repo.EmployeeRepository;

@Service
public class EmployeeserviceImp implements EmployeeService {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Integer SaveEmployee(Employee e) {
		// TODO Auto-generated method stub
		return repo.save(e).getId();
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Employee> getEmployee(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		repo.save(e);
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public boolean isPresent(Integer id) {
		// TODO Auto-generated method stub
		return repo.existsById(id);
	}

}
