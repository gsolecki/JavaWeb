package com.gsezone.javaweb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) throws Exception {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		Author a = new Author("Stephen", "McDonalld");

		session.save(a);
		session.flush();
		session.close();
		
	}
}