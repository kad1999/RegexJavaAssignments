package com.abc.app1.main;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.abc.app1.model.Product1;

public class GetProductPriceCriteria {
	public static void main(String[] args) {
		//1.bootstraping hibernate
				Configuration cfg = new Configuration();
				cfg.configure("com/abc/app1/cfgs/hibernate.cfg.xml");
				
				SessionFactory factory = cfg.buildSessionFactory();
				
				Session session = factory.openSession();
				
				CriteriaBuilder builder = session.getCriteriaBuilder();
				CriteriaQuery<Product1> criteriaQuery = builder.createQuery(Product1.class);
				Root<Product1> root =  criteriaQuery.from(Product1.class);
				criteriaQuery.select(root).where(builder.ge(root.get("price"), 3000));
				Query<Product1> q = session.createQuery(criteriaQuery);
				List<Product1> l = q.getResultList();
				l.forEach(System.out::println);
				
				
				session.close();
				factory.close();
	}
}
