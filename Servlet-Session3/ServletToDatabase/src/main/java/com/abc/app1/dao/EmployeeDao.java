package com.abc.app1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.abc.app1.Model.Employee;
import com.abc.app1.utils.DBUtils;

public class EmployeeDao {
	public Employee getEmployee(int eid) {
		Employee emp = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String select_query = "SELECT * from employee where eid=?";
		Connection con = DBUtils.getConnection();
		
		
		try {
			ps  = con.prepareStatement(select_query);
			ps.setInt(1, eid);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				emp = new Employee();
				emp.setEid(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setEsal(rs.getInt(3));
				System.out.println(emp);
			}else {
				System.out.println("No data found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}
}
