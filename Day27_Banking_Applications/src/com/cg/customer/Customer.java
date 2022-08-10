package com.cg.customer;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAccount;
import com.cg.application.MMSavingAccount;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAccount;
import com.cg.framework.SavingAccount;


public class Customer {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		BankFactory b=new MMBankFactory();
		SavingAccount s=new MMSavingAccount(1245,"Chetan Raut",10000,true);
		CurrentAccount c=new MMCurrentAccount(4630,"Priyanka Kondhawale",20000,1500);
		System.out.println("Saving Account is : "); 
		s.withdraw(s.getAccBal());
		System.out.println("Current Account is : "); 
		c.withdraw(c.getAccBal());
		System.out.println(s); 
		System.out.println(c); 
	}

}
