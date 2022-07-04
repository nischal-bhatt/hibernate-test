package org.koushik.javabrains.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NewTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Transaction t = ss.beginTransaction();
		
		Student studnew = new Student();
		
		studnew.setId(492);
		studnew.setName("heya");
		studnew.setEmail("nish@bni.com");
		studnew.setAddress("123123");
		ss.persist(studnew); //this MUST be within transaction boundaries
		t.commit();
		 
		ss.close();
		sf.close();
		
		System.out.println("data insertion success" );
		
	}

}
