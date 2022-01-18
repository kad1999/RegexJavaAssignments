package com.abc.app1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.app1.model.Employee;
import com.abc.app1.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Employee e){
		ResponseEntity<String> resp = null;
		
		try {
			Integer id = service.SaveEmployee(e);
			resp = new ResponseEntity<>("Employee "+id+" created", HttpStatus.OK);
		}catch(Exception x) {
			resp = new ResponseEntity<>(x.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return resp;
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getEmployees(){
		ResponseEntity<?> resp = null;
		
		try {
			List<Employee> empList = service.getEmployees();
			if(empList != null || !empList.isEmpty()) {
				resp = new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
			}else {
				resp = new ResponseEntity<String>(" not data found", HttpStatus.OK);
			}
		}catch(Exception e) {
			resp = new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return resp;
	}
	
	
}
