package April1test;

import java.util.Scanner;

class Subcource
{
	int sid;
	String sname;
	
	Subcource(int sid,String sname)
	{
		this.sid=sid;
		this.sname=sname;
	}
	public String toString()
	 {
		return sid+" "+sname;
	 }
}

public class Cource {
	int cid;
	String cname;
	Subcource sub;
	
	Cource(int cid,String cname,Subcource sub)
	{
		this.cid=cid;
		this.cname=cname;
		this.sub=sub;
	
	}
	public String toString()
	 {
		return cid+" "+cname+" "+sub;
	 }
	

	public static void main(String[] args) {
		Cource c[]=new Cource[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<c.length;i++)
		{
			System.out.println("enter the cource id");
			int id=sc.nextInt();
			System.out.println("enter the cource name");
			String name=sc.next();
			
			System.out.println("enter data for Subcurce");
			System.out.println("enter the subcource id");
			int sid=sc.nextInt();
			System.out.println("enter the subcource name");
			String sname=sc.next();
			
			Subcource s=new Subcource(sid,sname);
			c[i]=new Cource(id,name,s);
			
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		

	}

}
