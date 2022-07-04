package org.koushik.javabrains.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NewTest5 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Transaction t = ss.beginTransaction();
		
		Student rrrr=(Student) ss.get(Student.class, 678);
		
		Student studnew = new Student();
		
		studnew.setId(678);
		studnew.setName("apadiya22");
		studnew.setEmail("nish@bniaa.com");
		studnew.setAddress("123123");
		ss.merge(studnew); 
		t.commit();
		 
		ss.close();
		sf.close();
		
		System.out.println("data updating using update method success" );
		
	}

}
