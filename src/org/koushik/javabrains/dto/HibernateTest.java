package org.koushik.javabrains.dto;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {

		UserDetailsNew ud = new UserDetailsNew();
		
		ud.setUserId(99);
		ud.setUserName("first nuser");
		ud.setAddress(" first users address");
		ud.setJoinedDate(new Date());
		ud.setDescription("description");
		
		
		Configuration config = new Configuration().configure();
		
		SessionFactory sessionFactory = config.buildSessionFactory();
	  Session s = sessionFactory.openSession();
	  s.beginTransaction();
	  
	  s.save(ud);
	  
	  
	  s.getTransaction().commit();
	  
	  s.close();
	  
	  ud = null;
	  
	 Session s1 = sessionFactory.openSession();
	  s1.beginTransaction();
	  
	  UserDetailsNew sn =(UserDetailsNew)s1.get(UserDetailsNew.class, 99);
	  System.out.println(sn);
	  
	}

}
