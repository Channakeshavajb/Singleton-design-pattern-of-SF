package com.xworkz.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/* to create re - usable session factory
 * 
 */

public class HibernateUtil {

	private static SessionFactory factory;
	
	public static SessionFactory getFactory() {
		System.out.println("calling getFactory from HibernateUtil");
		return factory;
	}
	
	static {
		factory = new Configuration().configure().buildSessionFactory();
		System.out.println("init session factory in hibernate util" + factory.getStatistics());
	}
	
}
