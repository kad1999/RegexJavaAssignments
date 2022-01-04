package com.abc.app1.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.abc.app1.model.Product1;

public class GetEmployee1 {
public static void main(String[] args) {
		
		
		//1.bootstraping hibernate
		Configuration cfg = new Configuration();
		cfg.configure("com/abc/app1/cfgs/hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		String hql = "from Product1";
		Query q = session.createQuery(hql);
		
		List<Product1> l = q.list();
		l.forEach(System.out::println);
		
		session.close();
		factory.close();
	} 
}
