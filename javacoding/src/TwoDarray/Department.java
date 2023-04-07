package TwoDarray;
import java.util.Scanner;

class Employee
{
	int eid;
	String ename;
	
	
	
	Employee(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	
	}
	public String toString()
	{
		return eid+" "+ename;
	}
}

public class Department {
	
int did;
String dname;
Employee e;

Department(int did,String dname,Employee e)
{
	this.did=did;
	this.dname=dname;
	this.e=e;
}
public String toString()
{
	return did+" "+dname+" "+e;
}


	public static void main(String[] args) {
		Department dept[]=new Department[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<dept.length;i++)
		{
			System.out.println("enter the dept id"	);
			int id=sc.nextInt();
			System.out.println("enter the dept name"	);
			String dname=sc.next();
			
			System.out.println("enter the data for employee");
		
			System.out.println("enter the emp id"	);
			int eid=sc.nextInt();
			System.out.println("enter the emp name"	);
			String ename=sc.next();
			
			
			Employee e=new Employee(eid,ename);
			dept[i]=new Department(id,dname,e);
			
					}
		System.out.println("--------------------------");
		for(int i=0;i<dept.length;i++)
		{
			System.out.println(dept[i]);
		}
		

	}

}
