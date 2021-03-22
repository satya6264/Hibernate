package com.vidvaan.hibernate.client;

import java.util.Date;

import com.vidvaan.hibernate.dao.AccountDAO;
import com.vidvaan.hibernate.entity.Account;

public class AccountService {
	
	public static void main(String[] args) {
		AccountDAO accountDAO = new AccountDAO();
		
//		Account cAccount=new Account();
//		cAccount.setAccNo(101);
//		cAccount.setName("Satya");
//		cAccount.setBalance(25000.00);
//		cAccount.setCreationDate(new Date());
//		accountDAO.insert(cAccount);
//		System.out.println("Account Created Succesfully...");
		
//		Account uAccount=new Account();
//		uAccount.setAccNo(101);
//		uAccount.setName("Satya G");
//		uAccount.setBalance(22000.00);
//		uAccount.setCreationDate(new Date(2020, 10, 02));
//		accountDAO.update(uAccount);
//		System.out.println("Account Updated succesfully...");
		

//		System.out.println(accountDAO.get(101));
//		System.out.println("Account retrived succesfully...");
		
		accountDAO.delete(101);
		System.out.println("Account Deleted succesfully...");
		
	}
	
	

}
