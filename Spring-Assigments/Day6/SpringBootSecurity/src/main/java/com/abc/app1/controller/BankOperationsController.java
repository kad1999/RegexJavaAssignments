package com.abc.app1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankOperationsController {
	
	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}
	
	@GetMapping("/loanApprove")
	public String loanPage() {
		return "loan";
	}
	
	@GetMapping("/balance")
	public String showBalancePage() {
		return "show_balance";
	}
	
	@GetMapping("/offers")
	public String offerPage() {
		return "offers";
	}
	
	@GetMapping("/denied")
	public String accessDeniedPage() {
		return "access_denied";
	}
}
