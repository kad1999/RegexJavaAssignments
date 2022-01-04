package com.abc.app1.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abc.app1.model.Customer;

public class UpdateCustomer {
	public static void main(String[] args) {
		
		//1.bootstraping hibernate
		Configuration cfg = new Configuration();
		cfg.configure("com/abc/app1/cfgs/hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = null;
		
		Customer c = new Customer();
		c.setId(101);
		c.setName("Divya");
		c.setMobile(19999383);
		c.setEmail("d@gmail.com");
		if(c!=null) {
			try {
				tx = session.beginTransaction();
				session.update(c);
				tx.commit();
				System.out.println("Success");
			}catch(Exception ex) {
				tx.rollback();
				System.out.println("Error");
			}
		}else {
			System.out.println("no such cutomer");
		}
		
		
		session.close();
		factory.close();
	} 	
}
