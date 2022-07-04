package org.koushik.javabrains.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NewTest8 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Object o =ss.load(Student.class, 36);
		//use get if you are not sure if object exists or not
		Student st = (Student)o;
		
		System.out.println(st.getId());
		
		ss.close();
		sf.close();
		
	}

}
