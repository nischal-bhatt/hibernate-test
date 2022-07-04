package org.koushik.javabrains.dto;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQL_AGGREGATE {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session ss = sf.openSession();
		
		String hql = "select sum(id) from Stud";
		
		Query createQuery = ss.createQuery(hql);
		
		Long avg = (Long)createQuery.uniqueResult();
		
		System.out.println(avg);
		
		ss.close();
		sf.close();
		
	}

}
