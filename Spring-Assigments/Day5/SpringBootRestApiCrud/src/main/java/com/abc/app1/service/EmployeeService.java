package com.abc.app1.service;

import java.util.List;
import java.util.Optional;

import com.abc.app1.model.Employee;

public interface EmployeeService {
	public Integer SaveEmployee(Employee e);
	
	public List<Employee> getEmployees();
	
	public Optional<Employee> getEmployee(Integer id);
	public void updateEmployee(Employee e);
	public void deleteEmployee(Integer id);
	public boolean isPresent(Integer id);
}
