package com.ibm.bank;

public class Current extends Accounts {

	public static double overdraft;
	public double val;
	static {
		overdraft=OD_AMT;
	}
	public Current(String holder) {
		super(holder, MIN_CUR_BAL);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void deposit(double x) {
		if(overdraft+x<=OD_AMT)
		{
			overdraft+=x;
		}
		else
		{
			balance+=x-(OD_AMT-overdraft);
			overdraft=OD_AMT;
			
		}
			
	}
	@Override
	public void withdraw(double x) throws BalanceException {
		if(x<balance)
			balance-=x;
		else
		{
			
			x=x-balance;
			balance=0;
			overdraft-=x;
		}
			
	}
	public void print()
	{
		System.out.println("Balance: "+balance);
		System.out.println("Overdraft: "+overdraft);
	}
	

}
