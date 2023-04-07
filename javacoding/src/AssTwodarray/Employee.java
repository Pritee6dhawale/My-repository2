package AssTwodarray;

import java.util.Scanner;

class Department
{
	int deptid;
	String deptname;
	
	
	Department(int deptid,String deptname)
	{
		this.deptid=deptid;
		this.deptname=deptname;
	}
	public String toString()
	{
	return deptid+" "+deptname;	
	}
}

public class Employee 
{
	int empno;
	String empname;
	Department dept;
	
	Employee(int empno,String empname,Department dept)
	{
		this.empno=empno;
		this.empname=empname;
		this.dept=dept;
	}
	public Employee(int no, String name, String dept2) {
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return empno+" "+empname+" "+dept;
	}
	

			
		
		
public static void main(String[] args) {
	Employee[]emp=new Employee[3];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<emp.length;i++)
	{
		System.out.println("enter the empno");
		int no=sc.nextInt();
		System.out.println("enter the empname");
		String name=sc.next();
	
		
		System.out.println("enter the deptid");
		int id=sc.nextInt();
		System.out.println("enter the deptname");
		String name1=sc.next();
		
	Department d=new Department(id,name1);
	emp[i]=new Employee(no,name,d);
	
	}
	for(int i=0;i<emp.length;i++)
	{
		System.out.println(emp[i]);
	}
		


		}

	}


