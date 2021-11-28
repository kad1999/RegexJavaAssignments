package com.abc.app1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.abc.app1.model.Employee;
import com.abc.app1.utils.DBUtils;

public class EmployeeDao {
	public int addEmployee(int eid, String name, String gender, String role, String location, String passport) {
		
		PreparedStatement ps = null;
		String select_query = "insert into Employee values(?,?,?,?,?,?)";
		Connection con = DBUtils.getConnection();
		int rs = 0 ;
		
		try {
			ps  = con.prepareStatement(select_query);
			ps.setInt(1, eid);
			ps.setString(2, name);
			ps.setString(3, gender);
			ps.setString(4, role);
			ps.setString(5, location);
			ps.setString(6, passport);
			
			rs = ps.executeUpdate();
			if(rs==1) {
				System.out.println("Employee added succesfuly");
			}else {
				System.out.println("Not added some error.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
}
