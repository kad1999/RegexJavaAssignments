package com.abc.app1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abc.app1.model.Customer;
import com.abc.app1.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customer_service;
	
	@RequestMapping("/")
	public String viewHomePage(Model m) {
		List<Customer> l = customer_service.listAll();
		m.addAttribute("listCustomer", l);
		return "index";
	}
	
	@RequestMapping("/new")
	public String viewAddCustomerPage(Model m) {
		Customer c = new Customer();
		m.addAttribute("customer", c);
		return "newCustomer.html";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer c) {
		customer_service.save(c);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView dispalyeditPage(@PathVariable(name="id") int id) {
		Customer c= customer_service.getCustomerById(id);
		
		ModelAndView mav= new ModelAndView("edit_customer");
		mav.addObject("customer", c);
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable(name="id") int id) {
		customer_service.delete(id);
		return "redirect:/";
	}
}
