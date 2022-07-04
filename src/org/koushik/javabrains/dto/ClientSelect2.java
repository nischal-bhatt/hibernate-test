package org.koushik.javabrains.dto;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientSelect2 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Transaction t = ss.beginTransaction();
		
		String hql = "select name,email from Stud";
		
		Query createQuery = ss.createQuery(hql);
		
		List<Object[]> a = createQuery.list();
		System.out.println(a);
		for (Object o : a)
		{
			Object[] r = (Object[]) o;
			System.out.println(r[0]);
			System.out.println(r[1]);
			System.out.println();
		}
		
		t.commit();
		
		ss.close();
		sf.close();
		
	}

}
