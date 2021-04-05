package com.ibm.bank;

public interface Banking {
	 void summary();
	 void deposit(double x);
	 void withdraw(double x) throws BalanceException;
	 void statement();

}
