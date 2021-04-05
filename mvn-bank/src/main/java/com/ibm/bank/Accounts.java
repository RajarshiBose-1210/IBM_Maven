package com.ibm.bank;

import java.util.Vector;

public abstract class Accounts implements Banking{
	
	/**
	 * This class represents generalised banking account.
	 * @Author Rajarshi Bose
	 * @version 1.0
	 * 
	 * 
	 */
	

	private int acnNo;
	private String holder;
	protected double balance;
	private static int autoUpdate;
	public static final int MIN_ACC_NO=1001;
	public static final double MIN_BAL_AMT=1000;
	public static final double OD_AMT=10000;
	public static final double MIN_CUR_BAL=5000;
	public static final double MIN_OPEN_BL=0;
	
	//protected Transactions tnx[];
	Vector<Transactions> txn=new Vector<Transactions>();
	protected int idx;
	static {
		autoUpdate=MIN_ACC_NO;
	}
	
	/**Parametrised constructor*/
	public Accounts(String holder, double balance) {
		super();
		this.acnNo = autoUpdate++;
		this.holder = holder;
		this.balance = balance;
		
		txn.add(new Transactions("OB", balance, balance));
	}
	
public void summary() {
		
		System.out.println("Account Number:"+acnNo+"\nHolder Name:"+holder+"\nBalance:"+balance);
	}

public void deposit(double x) {
	balance+=x;
	txn.add(new Transactions("CR",x,balance));
	
}

public abstract void withdraw(double x) throws BalanceException;

public void statement()
{
	System.out.println("Transactions of A/C "+acnNo);
	for(int i=0;i<idx;i++)
		System.out.println(txn);;
}



}
