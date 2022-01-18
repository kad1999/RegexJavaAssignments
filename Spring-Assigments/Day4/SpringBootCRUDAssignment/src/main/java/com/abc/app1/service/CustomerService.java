package com.abc.app1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.app1.model.Customer;
import com.abc.app1.repo.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repo;
	
	public List<Customer> listAll() {
		return repo.findAll();
	}
	
	public void save(Customer c) {
		repo.save(c);
	}
	
	public Customer getCustomerById(long id) {
		return repo.getById(id);
	}
	public void delete(long id) {
		repo.deleteById(id);
	}

}
