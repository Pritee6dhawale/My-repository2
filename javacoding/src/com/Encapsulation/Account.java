package com.Encapsulation;

public class Account {
	
	private int acno;
	private String Name;
	private float Balance;

	
	public void Openaccount()
	{
		
		customerdetails(1234,"mr.sachin",15000);
	}
	
	private void customerdetails(int ano,String n,float b)
	{
	acno=ano;
	Name=n;
	Balance=b;
	}
	  void showaccountdetails()
	{
		System.out.println("customer Name:"+Name);
		System.out.println("account no:"+acno);
		System.out.println("account  balance:"+Balance);
		
	}
	

	public static void main(String[] args) {
		Account a=new Account();
		
		

	}

}
