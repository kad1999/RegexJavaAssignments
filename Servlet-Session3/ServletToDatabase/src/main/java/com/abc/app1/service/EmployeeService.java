package com.abc.app1.service;

import com.abc.app1.Model.Employee;
import com.abc.app1.dao.EmployeeDao;

public class EmployeeService {
	private EmployeeDao dao = new EmployeeDao();
	public Employee getEmployee(int eid) {
		return dao.getEmployee(eid);
	}
}
