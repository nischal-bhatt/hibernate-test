package org.koushik.javabrains.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {

		UserDetailsNew ud = new UserDetailsNew();
		
		ud.setUserId(281415);
		ud.setUserName("first nuser");
		
		
		Configuration config = new Configuration().configure();
		
		SessionFactory sessionFactory = config.buildSessionFactory();
	  Session s = sessionFactory.openSession();
	  s.beginTransaction();
	  
	  s.save(ud);
	  
	  s.getTransaction().commit();
	  
	  
	}

}
