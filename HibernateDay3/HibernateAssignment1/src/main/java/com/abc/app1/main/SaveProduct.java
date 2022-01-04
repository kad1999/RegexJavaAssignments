package com.abc.app1.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abc.app1.model.Product1;

public class SaveProduct {
	public static void main(String[] args) {
		
		
		//1.bootstraping hibernate
		Configuration cfg = new Configuration();
		cfg.configure("com/abc/app1/cfgs/hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = null;
		
		Product1 p = new Product1();
		p.setId(102);
		p.setName("pillow");
		p.setPrice(199.22);
		p.setBrand("kitex");
		try {
			tx = session.beginTransaction();
			session.save(p);
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
