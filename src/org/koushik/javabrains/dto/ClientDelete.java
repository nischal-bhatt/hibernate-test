package org.koushik.javabrains.dto;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDelete {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Transaction t = ss.beginTransaction();
	
		String hql = "delete Stud where id = 1";
		
		Query createQuery = ss.createQuery(hql);
		
		int executeUpdate = createQuery.executeUpdate();
		
		t.commit();
		ss.close();
		sf.close();
		
		System.out.println(executeUpdate);
	}

}
