package ArrayTest;
import java.util.Scanner;
import java.util.Date;
import java.util.Arrays;

class Subengine
{
	String type;
	
	Subengine(String type)
	{
		this.type=type;
	}
	public String toString()
	{
		return type;
	}
}
class Engine
{
	int engineid;
	Date lastdate;
	Subengine se;
	
	Engine(int engineid,Date lastdate,Subengine se)
	{
		this.engineid=engineid;
		this.lastdate=lastdate;
		this.se=se;
	}
	public String toString()
	{
		return engineid+" "+lastdate+" "+se;
	}
}
class Gear
{
	String Gtype;
	
	Gear(String Gtype)
	{
		this.Gtype=Gtype;
	}
	public String toString()
	{
		return Gtype;
	}
}

public class Car {
	int carid;
	String carcolor;
	Engine e;
	Gear g;
	
	Car(int carid,String carcolor,Engine e,Gear g)
	{
		this.carid=carid;
		this.carcolor=carcolor;
		this.e=e;
		this.g=g;
		}
	public String toString()
	{
		return carid+" "+carcolor+" "+e+" "+g;
	}
	
	

	public static void main(String[] args) {
		Car[]c=new Car[1];
	
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<c.length;i++)
		{
			System.out.println("enter carid");
			int id=sc.nextInt();
			System.out.println("enter carcolor");
			String cl=sc.next();
			
			
			System.out.println("enter engineid");
			int eid=sc.nextInt();
			System.out.println("enter edate");
			double date=sc.nextDouble();
			
			
			System.out.println("enter subenginetype");
			String ty=sc.next();
			
			
			System.out.println("enter Gtype");
			String typ=sc.next();
			
			Subengine s=new Subengine("ty");
			Engine e1=new Engine(eid,date,s);
			Gear g=new Gear("auto manual");
			 c[i]=new Car(id,cl,e1,g);
			 
			}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		

	}

}
