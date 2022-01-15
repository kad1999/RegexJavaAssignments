package com.abc.app1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("employee")
	public String displayEmployeeView(Model model) {
		model.addAttribute("msg","Employee details");
		return "employee";
	}
}
