package com.vidvaan.account.hiber.client;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.vidvaan.account.hiber.entity.Account;

public class AccountTest {

	public static void main(String[] args) {

//		Account account = new Account(102, "Harish", 22000.00);
//		Account account1 = new Account(103, "Praveen", 22000.00);
//		Account account2 = new Account(104, "Raju", 22000.00);
//		Account account3 = new Account(105, "Karthik", 22000.00);
//		Account account2 = new Account();
//		account2.setAcNo(101);

		Configuration configuration = new Configuration();
		SessionFactory sfactory = configuration.configure("com/vidvaan/account/hiber/config/account.cfg.xml")
				.buildSessionFactory();

		Session session = sfactory.openSession();
//		session.save(account);
//		session.save(account1);
//		session.save(account2);
//		session.save(account3);
//		session.delete(account2);
//		session.beginTransaction().commit();
//		Query query = session.createQuery("from Account where acNo=101");

//		Query query1=session.createQuery("from Account");
//		List<Account> accounts=query1.list();
//		for (Account account : accounts) {
//			System.out.println(account);
//		}

		/*
		 * using criteria
		 */

		Criteria query = session.createCriteria(Account.class);
//		List<Account> accounts = query.list();
//		for (Account account : accounts) {
//			System.out.println(account);
//		}

		Criterion c1 = Restrictions.gt("acNo", 103);
		query.add(c1);

		List<Account> accounts = query.list();
		for (Account account : accounts) {
			System.out.println(account);
		}

//		query.setProjection(Projections.property("acName"));
//		List list = query.list();
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//		String ac=(String) itr.next();
//		System.out.println(ac);
//		}

//		query.setProjection(Projections.property("acName"));
//		query.setProjection(Projections.property("acNo"));

//		List list = query.list();
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//		Integer ac=(Integer) itr.next();
//		System.out.println(ac);
//		}

//		ProjectionList pList = Projections.projectionList();
//		pList.add(Projections.property("acNo"));
//		pList.add(Projections.property("acName"));
//		query.setProjection(pList);
//		
//		List list = query.list();
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			Object[] arr=(Object[]) itr.next();
//			System.out.println(arr[0]);
//			System.out.println(arr[1]);
//			System.out.println("----------------");
//		}

		// List<Account> accounts = session.createCriteria(Account.class)
//											.add(Restrictions.eq("acName", "Harish"))
//											.add(Restrictions.gt("acBalance", 1800.0))
//											.list();
//			
//			for (Object account : accounts) {
//				System.out.println(account);
//			}

		session.close();
	}

}
