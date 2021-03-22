package com.vidvaan.hiber.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vidvaan.hiber.entity.Employee2;

public class Employee2Test {

	
	public static void main(String[] args) {
		Employee2 employee2 = new Employee2(103, "Karthik", 22000.0);
		Configuration configuration = new Configuration();
		SessionFactory sfactory = configuration.configure("com/vidvaan/hiber/config/Employee2.cgf.xml")
				.buildSessionFactory();
		Session session = sfactory.openSession();
//		session.save(employee2);
//		session.beginTransaction().commit();
		
		Query query = session.createQuery("From Employee2");
		List<Employee2> emp = query.list();
		for (Employee2 employee22 : emp) {
			System.out.println(employee22);
		}
		
		session.close();
	}

}
