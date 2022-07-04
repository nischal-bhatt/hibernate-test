package org.koushik.javabrains.dto;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientSelect3 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Transaction t = ss.beginTransaction();
		
		String hql = "from Stud where id = 33";
		
		Query createQuery = ss.createQuery(hql);
		
		Stud uniqueResult = (Stud)createQuery.uniqueResult();
		
		
		System.out.println(uniqueResult.getName());
		
		t.commit();
		
		ss.close();
		sf.close();
		
	}

}
