package com.ibm.bank;
import com.ibm.bank.AccountFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Banking;
import com.ibm.bank.Savings;

public class TestAccounts {
	public static void main(String[] args) {
		
		/*Accounts a=new Accounts("ABCD",100);
		a.summary();
		a.deposit(120);
		a.withdraw(100);
		a.summary();*/
		Banking s=AccountFactory.openSavingsAcc("ABCD");
		
		s.deposit(100);
		s.deposit(200);
		s.deposit(700);
		try {
			s.withdraw(5000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //for debugging by user
			System.out.println(e);//for logger
			System.out.println(e.getMessage());//for end user
		}
		s.statement();
		
		
		
	}

}
