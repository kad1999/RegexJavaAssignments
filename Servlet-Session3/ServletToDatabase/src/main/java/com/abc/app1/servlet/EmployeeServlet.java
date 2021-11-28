package com.abc.app1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.app1.Model.Employee;
import com.abc.app1.service.EmployeeService;

@WebServlet("/getEmployee")
public class EmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employee emp = null;
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		int id = Integer.parseInt(req.getParameter("id"));
		EmployeeService es= new EmployeeService();
		emp = es.getEmployee(id);
		if(emp!=null) {
			out.println("<h2>Employee Details</h2>");
			out.println("<p>Employee id - "+emp.getEid());
			out.println("<br> Name - "+emp.getEname());
			out.println("<br> Salary - "+emp.getEsal());
			out.println("<a href='index.html'>Home page</a>");
		}else {
			out.println("<h2>Employee not found</h2>");
			out.println("<a href='index.html'>Home page</a>");
		}
		out.close();
	}
}
