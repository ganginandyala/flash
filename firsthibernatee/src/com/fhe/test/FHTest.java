package com.fhe.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fhe.entities.Project;


public class FHTest {

	public static void main(String[] args) {
		Configuration configuration=new Configuration().configure("com/fhe/entities/hibernate.cfg.xml");
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Project project=(Project)session.get(Project.class,1);
		System.out.println(project);
		sessionFactory.close();
		session.close();
		

	}

}
