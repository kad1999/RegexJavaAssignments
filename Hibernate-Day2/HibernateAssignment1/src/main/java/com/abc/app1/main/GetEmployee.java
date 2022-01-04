package com.abc.app1.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abc.app1.model.Product1;

public class GetEmployee {
public static void main(String[] args) {
		
		
		//1.bootstraping hibernate
		Configuration cfg = new Configuration();
		cfg.configure("com/abc/app1/cfgs/hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		int pid = 101;
		Product1 p = session.get(Product1.class, pid);
		
		System.out.println(p);
		
		session.close();
		factory.close();
	} 
}
