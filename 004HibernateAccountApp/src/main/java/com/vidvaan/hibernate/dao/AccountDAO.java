package com.vidvaan.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vidvaan.hibernate.entity.Account;
import com.vidvaan.hibernate.util.SessionUtil;

public class AccountDAO {

	public Account get(long accNo) {

		Session session = null;
		Account account = null;
		session = SessionUtil.getSession();
		account = (Account) session.get(Account.class, accNo);
		SessionUtil.closeSession(session);

		return account;

	}

	public void insert(Account account) {
		Session session = null;
		session = SessionUtil.getSession();
		session.getTransaction().begin();
		session.save(account);
		session.getTransaction().commit();
		SessionUtil.closeSession(session);

	}

	public void update(Account account) {
		Session session = null;
		session = SessionUtil.getSession();
		session.getTransaction().begin();
		session.update(account);
		session.getTransaction().commit();
		SessionUtil.closeSession(session);
	}

	public void delete(long accNo) {
		Session session = null;
		Transaction transaction = null;
		session = SessionUtil.getSession();
//		transaction = session.beginTransaction();
		session.getTransaction().begin();
		Account account = (Account) session.get(Account.class, accNo);
		session.delete(account);
//		transaction.commit();
		session.getTransaction().commit();
		SessionUtil.closeSession(session);
	}

}
