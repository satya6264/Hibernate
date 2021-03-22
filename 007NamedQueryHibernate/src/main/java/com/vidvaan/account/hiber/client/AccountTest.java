package com.vidvaan.account.hiber.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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

		// Query query = session.createQuery("from Account where acNo=101");
//		Query query = session.getNamedQuery("findAllAccounts");
//		Query query = session.getNamedQuery("com.vidvaan.account.hiber.entity.Account.findAllAccounts");
//		List<Account> accounts = query.list();
//		for (Account account : accounts) {
//			System.out.println(account);
//		}
		
//		Query query = session.getNamedQuery("Account.avgBalance");
//		double avgBalance=(Double) query.uniqueResult();
//		System.out.println(avgBalance);
		
//		Query query = session.getNamedQuery("Account.byName");
//		query.setParameter("name", "Harish");
//		List<Account> accounts=query.list();
//		for (Account account : accounts) {
//			System.out.println(account);
//		}
		
		Query query = session.getNamedQuery("Account.byBalance");
		query.setParameter("balance", 22000.00);
		List<Account> accounts=query.list();
		for (Account account : accounts) {
			System.out.println(account);
		}
		
		session.close();
	}

}
