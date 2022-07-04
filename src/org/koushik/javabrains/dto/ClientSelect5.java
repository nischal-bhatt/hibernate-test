package org.koushik.javabrains.dto;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientSelect5 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session ss = sf.openSession();
		
		//Transaction t = ss.beginTransaction();
		
		String hql = "from Stud";
		
		Query createQuery = ss.createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Stud> list = createQuery.list();
		
		for (int i =0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getId());
			System.out.println(list.get(i).getName());
			System.out.println("====");
		}
		
		//t.commit();
		
		ss.close();
		sf.close();
		
	}

}
