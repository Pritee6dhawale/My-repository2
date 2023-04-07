package com.Array;

class Employee
{
	int  id;
	String name;
	Double salary;
	
	
	public Employee (int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() 
	{
		return id+" "+name+" "+salary;
	}
		
	
	
}

public class Employeesalary {
	

	public static void main(String[] args) {
		
		Employee []emp=new Employee[4];
		emp[0]=new Employee(1,"pritee",20000);
		emp[1]=new Employee(2,"pritee",30000);

		emp[2]=new Employee(3,"pritee",35000);

		emp[3]=new Employee(4,"pritee",10000);
		
		for(Employee e:emp)
		{
			if(e.salary>20000)
			{
				e.salary*=1.1;
				System.out.println(e);
			}
		}


	}

}
