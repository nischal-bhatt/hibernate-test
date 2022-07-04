package org.koushik.javabrains.dto;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientInsertHQL3 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Transaction t = ss.beginTransaction();
	
		String hql = "insert into NewStudent(id,name,email,address) select s.studentId, s.studentName, s.email, s.address from OldStudent s where s.studentName = 'lmn'";
		
		Query createQuery = ss.createQuery(hql);
		
		int r = createQuery.executeUpdate();
		
		t.commit();
		ss.close();
		sf.close();
		
		System.out.println(r);
	}

}
