package com.abc.app1.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abc.app1.model.Customer;

public class DeleteCustomer {
public static void main(String[] args) {
		
		//1.bootstraping hibernate
		Configuration cfg = new Configuration();
		cfg.configure("com/abc/app1/cfgs/hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = null;
		
		Customer c = new Customer();
		c.setId(101);
		c.setName("Diya");
		c.setMobile(19999383);
		c.setEmail("d@gmail.com");
		try {
			tx = session.beginTransaction();
			session.delete(c);
			tx.commit();
			System.out.println("Success");
		}catch(Exception ex) {
			tx.rollback();
			System.out.println("Error");
		}
		
		session.close();
		factory.close();
	} 
}
