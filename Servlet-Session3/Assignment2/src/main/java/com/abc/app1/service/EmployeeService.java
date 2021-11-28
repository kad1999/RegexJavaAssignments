package com.abc.app1.service;

import com.abc.app1.dao.EmployeeDao;

public class EmployeeService {
	private EmployeeDao dao = new EmployeeDao();
	public int addEmployee(int eid, String name, String gender, String role, String location, String passport) {
		return dao.addEmployee(eid, name, gender, role, location, passport);
	}
}
