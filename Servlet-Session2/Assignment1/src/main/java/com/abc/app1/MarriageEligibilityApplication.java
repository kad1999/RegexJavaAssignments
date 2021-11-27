package com.abc.app1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/eligibility")
public class MarriageEligibilityApplication extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String gender = req.getParameter("gender");
		
		PrintWriter out = resp.getWriter();
		if(gender.equals("male")) {
			if(age>=25) {
				out.println(name +" is Eligible to marry");
			}else {
				out.println(name+" is not eligible to marry");
			}
		}else {
			if(age>=21) {
				out.println(name+" is eligible to marry");
			}else {
				out.println(name+ " is not eligible to marry");
			}
		}
		out.close();
		
	}
}
