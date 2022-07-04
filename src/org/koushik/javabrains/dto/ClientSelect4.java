package org.koushik.javabrains.dto;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientSelect4 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Transaction t = ss.beginTransaction();
		
		String hql = "select email from Stud";
		
		Query createQuery = ss.createQuery(hql);
		
		List<String> list = createQuery.list();
		
		
	    for (int i =0; i<list.size(); i++)
	    {
	    	System.out.println(list.get(i));
	    }
		
		t.commit();
		
		ss.close();
		sf.close();
		
	}

}
