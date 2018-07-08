package com.balceda.JavaEE_JakartaEE.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PlatziSession {

	Session session;

	public PlatziSession() {
		super();
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
	}

	public Session getSession() {
		return session;
	}

}
