package com.Array;
import java.util.Scanner;

import java.util.Arrays;

public class Stud {
	
	int id;
	String name;
	int marks[];
    int age;
	
	Stud(int id,String name,int []marks,int age)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.age=age;
	}
	public String toString()
	{
		return id+" "+name+" "+age+" "+Arrays.toString(marks);
	}

	public static void main(String[] args) {
		Stud s[]=new Stud[3];
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=0;i<s.length;i++)
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter age");
			int a=sc.nextInt();
			System.out.println("enter marks");
			int []m=new int[3];
		
			
			for(int j=0;j<m.length;j++)
			{
				m[j]=sc.nextInt();
			}
			s[i]=new Stud(id,name,m,a);
			
		}
		for(Stud st:s)
		{
			System.out.println(st);
		}
		System.out.println("--------------------------");
		for(Stud st:s)
		{
		int []mk=st.marks;
		int sum=0,age=0;
		
		for(i=0;i<mk.length;i++)
		{
			sum+=mk[i];
		}
		int per=sum/mk.length;
		
		System.out.println(per);
		if(per>60 && age<=15)
		{
			System.out.println(st+" per="+per);
			System.out.println(age);
		}
		

	}

}
}
