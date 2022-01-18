package com.abc.app1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.app1.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
