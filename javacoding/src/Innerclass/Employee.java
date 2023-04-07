package Innerclass;

public class Employee {
	
	int eno;
	String ename;
	private int salary=20000;
	
	
	class Department
	{
		int did=101;
		String dname;
		
	void	show(int did,String dname)
		{
			this.did=did;
			this.dname=dname;
			System.out.println(did+" "+dname);
		}
		
	}
class Department1
{
	String d_city;
	void dept(String d_city)
	{
		this.d_city=d_city;
		System.out.println("d_city"+d_city);
	}
	
}
	public static void main(String[] args) {
		Employee e=new Employee();
		
		Employee.Department d=e.new Department();
		d.show(1001, "sales");
		Employee.Department1 d1=e.new Department1();
		d1.dept("pune");
		

	}

}
