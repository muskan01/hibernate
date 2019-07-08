package org.jms.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.jb.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails user = new UserDetails();
		user.setId(1);
		user.setName("fin");
		user.setSalary(4900);
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();

	}

}
