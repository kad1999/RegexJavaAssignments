package com.abc.app1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.abc.app1.document.Customer;
import com.abc.app1.repo.CustomerRepository;

@Component
public class CustomerRunner implements CommandLineRunner{

	@Autowired
	private CustomerRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.deleteAll();
		repo.save(new Customer("Wills", "w@gmail.com", 45666.6));
		repo.findAll().forEach(System.out::println);
	}

}
