package org.koushik.javabrains.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientSelect {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Transaction t = ss.beginTransaction();
		
		OldStudent os = new OldStudent(123,"abc","sss","hihi");
		OldStudent os2 = new OldStudent(189,"lmn","sss","hihi");
		
		OldStudent os3 = new OldStudent(222,"xyz","sss","hihi");
		
		
		ss.save(os);
		ss.save(os2);
		ss.save(os3);
		
		t.commit();
		
		ss.close();
		sf.close();
		
	}

}
