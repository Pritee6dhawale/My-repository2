package Arrayofobject;

import java.util.Scanner;

class Customer
{
    private	int cid;
	private String cname;
	private float balance ;
	
	public Customer(int cid,String cname,float bal)
	{
		this.cid=cid;
		this.cname=cname;
		this.balance=bal;
	}
	public  void setCid(int cid)
	{
		this.cid=cid;
	}
	public  void setCname(String cname)
	{
		this.cname=cname;
	}
	public  void setBalance(float bal )
	{
		this.balance=bal;
	}
	public int getCid()
	{
		return cid;
	}
	public String getCname()
	{
		return cname;
	}
	public float getBalance()
	{
		return balance;
	}
	public String toString()
	{
		return cid+" "+cname+" "+balance;
	}
	
}

public class Paytm {
	public void withDraw(double withdrwamt)
	
	{
		Customer c=new Customer();
		c.setCid(101);
		c.setCname("komal");
		float customerbal=c.getBalance();
		Scanner sc=new Scanner(system.in);
		int expence=sc.nextInt();
		float newbal=customerbal-expense;
		c.setBalance(newbal);
		
	}

	public static void main(String[] args) {
		Customer c[]=new Customer[3];
		
		
		
		
		
	

	}

}
