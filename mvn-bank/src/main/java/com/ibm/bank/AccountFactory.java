package com.ibm.bank;

public final class AccountFactory {
	private AccountFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static Banking openSavingsAcc(String holder)
	{
		return new Savings(holder);
	}
	
	public static Banking openCurrent(String holder)
	{
		return new Current(holder);
	}

}
