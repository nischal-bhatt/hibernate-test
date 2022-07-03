package org.koushik.javabrains.dto;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class ProjectionsTest {

	public static void main(String[] args) {

		SessionFactory sf =
				new Configuration().configure().buildSessionFactory();
	
	    Session session = sf.openSession();
	    
	    session.beginTransaction();
	    
	    
	    Criteria criteria = session.createCriteria(UserDetailsNew.class)
	    		            .setProjection(Projections.property("userName"));
	    
	    
	    @SuppressWarnings("unchecked")
		List<String> users = (List<String>)criteria.list();
	    
	    session.getTransaction().commit();
	    session.close();
	    
	    System.out.println(users);
	
	}

}
