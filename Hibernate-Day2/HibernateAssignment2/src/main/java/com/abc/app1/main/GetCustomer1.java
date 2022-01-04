package com.abc.app1.main;



import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import com.abc.app1.model.Customer;

public class GetCustomer1 {
	public static void main(String[] args) {
		
		//1.bootstraping hibernate
		Configuration cfg = new Configuration();
		cfg.configure("com/abc/app1/cfgs/hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		String hq = "from Customer";
		
		Query query = session.createQuery(hq);
		List<Customer> list = query.list();
		list.forEach(System.out::println);
		
		
		
		session.close();
		factory.close();
	} 
}
