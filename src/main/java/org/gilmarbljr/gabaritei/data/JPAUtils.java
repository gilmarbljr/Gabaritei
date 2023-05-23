package org.gilmarbljr.gabaritei.data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.EntityManager;

public class JPAUtils {
	
	private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	public static Session getSession() {
		return sessionFactory.openSession();
	}
	
	public static EntityManager getEntityManager() {
		return sessionFactory.createEntityManager();
	}

}
