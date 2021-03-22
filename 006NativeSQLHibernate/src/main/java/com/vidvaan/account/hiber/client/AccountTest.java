package com.vidvaan.account.hiber.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.StandardBasicTypes;

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
		
		String SQL = "SELECT * FROM ACCOUNT";
		String SQL2 = "select acno,acname from account where acno = 102";
		SQLQuery query = session.createSQLQuery(SQL2);
		

//		List<Object[]> accounts = query.list();
//		for (Object[] account : accounts) {
//			
//
//			System.out.println(account[0]);
//			System.out.println(account[1]);
////			System.out.println(account[2]);
//			System.out.println("-----------------");
//		}
		
		query.addScalar("ACNO", StandardBasicTypes.INTEGER);
					query.addScalar("ACNAME", StandardBasicTypes.STRING);
					query.addScalar("ACBALANCE", StandardBasicTypes.DOUBLE);
					List<Object[]>  list = query.list();
					for (Object[] row : list) {
						int accountId = (Integer) row[0];
						String name = (String) row[1];
//					double balance = (Double) row[2];
					System.out.println("\naccountId : " + accountId);
					System.out.println("name : " + name);
//				System.out.println("balance : " + balance);
			}

		session.close();
	}

}
