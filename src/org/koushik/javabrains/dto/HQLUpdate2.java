package org.koushik.javabrains.dto;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLUpdate2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Transaction t = ss.beginTransaction();
		
		String hql  = "update Stud set name = 'gym' where name = 'ord'";
		
		Query createQuery = ss.createQuery(hql);
		int executeUpdate = createQuery.executeUpdate();
		System.out.println(executeUpdate);
		t.commit();
		ss.close();
		sf.close();
	}

}
