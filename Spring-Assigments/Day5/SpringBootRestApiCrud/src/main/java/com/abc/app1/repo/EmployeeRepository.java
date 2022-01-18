package com.abc.app1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.app1.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
