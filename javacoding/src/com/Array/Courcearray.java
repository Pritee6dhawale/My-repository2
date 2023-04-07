package com.Array;
import java.util.Scanner;

class Student
{
	int id;
	String name;
	String adress;
	
	
	Student(int id,String name,String adress)
	{
		this.id=id;
		this.name=name;
		this.adress=adress;
	}
	public String toString()
	{
		return id+" "+name+" "+adress; 
	}
	
}

public class Courcearray {
	int cid;
	String cname;
	int cfees;
	Student s;
	
	Courcearray(int cid,String cname,int cfees, Student s )
	{
		this.cid=cid;
		this.cname=cname;
		this.cfees=cfees;
		this.s=s;
		
	}
	public String toString()
	{
		return cid+" "+cname+" "+cfees+" "+s;
	}

	public static void main(String[] args) {
		Courcearray []c=new Courcearray[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<c.length;i++)
		{
			System.out.println("enter the cid");
			int id=sc.nextInt();
			System.out.println("enter the cname");
			String cname=sc.next();
			System.out.println("enter the cfees");
			int cfees=sc.nextInt();
			
			
			System.out.println("enter the data for Student");
			System.out.println("enter sid");
			int sid=sc.nextInt();
			System.out.println("enter sname");
			String sname=sc.next();
			System.out.println("enter sadrees");
			String sadress=sc.next();
			
			
			Student s=new Student(sid,sname,sadress);
			c[i]=new Courcearray(id,cname,cfees,s);
			
			
		}
		System.out.println("..........");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		

	}

}
