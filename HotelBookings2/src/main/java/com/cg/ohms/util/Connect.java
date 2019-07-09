package com.cg.ohms.util;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connect {
	
	private static EntityManagerFactory factory;

	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("JpaDemo");
		}
		return factory;
	}

	public static void shutdown() {
		if (factory != null) {
			factory.close();
		}
	}
}
