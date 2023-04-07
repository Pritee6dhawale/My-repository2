package com.Project;
import java.util.Scanner;

class Employee
{
	private int eid;
	private String ename;
	private String address;
	private int salary;

	
public 	Employee(int eid,String ename,String address,int salary)
	{
	super();
	this.eid=eid;
	this.ename=ename;
	this.address=address;
	this.salary=salary;
	}

public void setEid(int eid)
{
	this.eid=eid;
}
public void setEname(String ename)
{
	this.ename=ename;
}
public void setAdrress(String address)
{
	this.address=address;
}
public void setSalary(int salary)
{
	this.salary=salary;
}
public int getEid()
{
	
	return eid;
}

public String getEname()
{
	
	return ename;
}
public String getAddress()
{
	
	return address;
}
public int getSalary()
{
	
	return salary;
}


public String toString()
	{
		return eid+" "+ename+" "+address+" "+salary;
	}
}
	 


		
	
public class Emplyeeproject {

	public static void main(String[] args) {
		Employee e[]=new Employee[10];
		Scanner sc=new Scanner(System.in);
		int count=0,flag=0;
		
		while(true)
		{
			System.out.println("1.Add Employee");
			System.out.println("2.Update EmployeeId");
			System.out.println("3.Delete employeeid");
			System.out.println("4.Search Employee");
			System.out.println("5 View Details");
			System.out.println("6 Exit");
			
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
			int eid;
			String ename;
			int e_id;
			String address;
			int salary;
			switch(choice)
			{
			case 1:
				System.out.println("Add Employee");
				System.out.println("Enter number of Employee");
				int emp=sc.nextInt();
				for(int i=0;i<emp;i++)
				{
					System.out.println("Enter Employee id");
					eid=sc.nextInt();
					System.out.println("Enter Employee name");
					ename=sc.next();
					System.out.println("Enter Employee Address");
					address=sc.next();
					System.out.println("Enter Employee Salary");
					salary=sc.nextInt();
					e[count]=new Employee(eid,ename,address,salary);
					count++;
					
				}
				System.out.println("Add Employee succesfully");
				break;
				
				case 2:
					System.out.println("Update Employee");
					System.out.println("Enetr Employee id you want to update");
					e_id=sc.nextInt();
					for(int i=0;i<count;i++)
					{
						if(  e[i].getEid()==e_id)
						{
							flag=1;
							System.out.println("Enter the salary you want to update");
							 salary=sc.nextInt();
							 e[i].setSalary(salary);
						}
					}
					if(flag==0)
					{
						System.out.println("employee is not present");
					}
					break;
					
				case 3:	
					System.out.println("Delete Employee");
					System.out.println("Enetr Employee id you want to update");
					 e_id=sc.nextInt();
					 for(int i=0;i<count;i++)
						{
							if(e[i].getEid()==e_id)
							{
								flag=1;
								e[i]=null;
								System.out.println("Employee delete sucessfully");
							}
			}
					 
					 if(flag==0)
						{
							System.out.println("Employee is not present");
							
						}
					 break;
					
				case 4:
					System.out.println("Search Employee id");
					System.out.println("Enter Employee id you want to search");
					e_id=sc.nextInt();
					for(int i=0;i<count;i++)
					{
						
					   if(e[i].getEid()==e_id)
					   {
						   flag=1;
						   break;
						  }
					   else
					   {
						   flag=0;
					   }
					}
					if(flag==1)
					{
						System.out.println("Employee is present");
					}
					else
					{
						System.out.println("Employee is not present");
					}
					   
					break;
					 
				case 5:
					System.out.println("show Employees");
					System.out.println(count);
					for(int i=0;i<count;i++)
					{
						if(e[i]!=null)
						{
						System.out.println(e[i]);
						}
					}
					break;
				case 6:
					System.exit(0);
					break;
		}
			
		
		
		
	}
	}
	

			
			
		


		
		
	
	}
