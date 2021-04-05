package com.ibm.bank;

public class Savings extends Accounts {

	public Savings(String holder) {
		super(holder,MIN_BAL_AMT);
		
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(double x) throws BalanceException {
		// TODO Auto-generated method stub
		
		if(balance-x<MIN_BAL_AMT)
			throw new BalanceException("Insufficient balance");
		else
			balance-=x;
		
	}

}
