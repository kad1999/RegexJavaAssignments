package com.abc.app1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.app1.service.EmployeeService;

@WebServlet("/register")
public class EmployeeServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String eid= req.getParameter("id");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String role = req.getParameter("role");
		String loc = req.getParameter("loc");
		String passport = req.getParameter("passport");
		PrintWriter out = resp.getWriter();
		int id = Integer.parseInt(eid);
		
		EmployeeService es = new EmployeeService();
		int result = es.addEmployee(id, name, gender, role, loc, passport != null?passport:"no");
		
		if(result==1) {
			out.println("Employee added with id="+id);
		}else {
			out.println("Some error");
		}
		out.close();
	}
}
