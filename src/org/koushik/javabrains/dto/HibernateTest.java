package org.koushik.javabrains.dto;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {

		UserDetailsNew ud = new UserDetailsNew();
		UserDetailsNew ud2 = new UserDetailsNew();
		//ud.setUserId(99);
		ud.setUserName("first nuserzaza");
		ud2.setUserName("hihiasad");
	//	ud.setAddress(" first users address");
	//	ud.setJoinedDate(new Date());
	//	ud.setDescription("description");
		
		
		Configuration config = new Configuration().configure();
		
		SessionFactory sessionFactory = config.buildSessionFactory();
	  Session s = sessionFactory.openSession();
	  s.beginTransaction();
	  
	  s.save(ud);
	  s.save(ud2);
	  
	  
	  s.getTransaction().commit();
	  s.evict(ud);
	  s.evict(ud2); //brings the object to detached state so that java garbage collection can pick it up
	  s.close();
	  
	  ud = null;
	  
	 Session s1 = sessionFactory.openSession();
	  s1.beginTransaction();
	  
	  UserDetailsNew sn =(UserDetailsNew)s1.get(UserDetailsNew.class, 2);
	  System.out.println(sn);
	  
	}

}
