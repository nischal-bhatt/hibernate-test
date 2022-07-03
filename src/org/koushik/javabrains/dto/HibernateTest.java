package org.koushik.javabrains.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {

		UserDetailsNew ud = new UserDetailsNew();
		
		ud.setUserId(281415);
		ud.setUserName("first nuser");
		
		UserDetailsNew ud1 = new UserDetailsNew();
		ud1.setUserId(281416);
		ud1.setUserName("michael");
		
		Configuration config = new Configuration().configure();
		
		SessionFactory sessionFactory = config.buildSessionFactory();
	  Session s = sessionFactory.openSession();
	  s.beginTransaction();
	  
	  s.save(ud);
	  s.save(ud1);
	  
	  s.getTransaction().commit();
	  
	  
	}

}
