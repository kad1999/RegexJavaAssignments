package com.abc.app1.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.abc.app1.document.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{

}
