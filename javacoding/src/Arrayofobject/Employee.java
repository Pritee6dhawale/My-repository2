package Arrayofobject;
import java.util.Scanner;

public class Employee {
	
	int id;
	String name;
	int salary;
	
	Employee(int id, String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;  
	}

	public static void main(String[] args) 
	{
		Employee[]emp=new Employee[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Enter the emp id");
			int eid=sc.nextInt();
			System.out.println("Enter the emp name");
			String ename=sc.next();
			System.out.println("Enter the salary");
			int sal=sc.nextInt();
			emp[i]=new Employee(eid,ename,sal);
			System.out.println("----------------------------------------------");
		}	
		
		    for(int i=0;i<emp.length;i++)
		   {
			      System.out.println(emp[i]);
		   }
		    
		   System.out.println("-----------------------------------------------------");
		   
		   for(int i=0;i<emp.length;i++)
		   {
			   for(int j=i+1;j<emp.length;j++)
			   {
			  if(emp[i].salary==emp[j].salary)
			  {
				  System.out.println(emp[i]);
				  System.out.println(emp[j]);
				  
			  }
			   }
		  }
	
		
	}
}

		
		   

	


		
	
		
		
		
		
