package basicprogram;
import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
for(int i=1;i<=num;i++)
{
	int a=i*i+i*i*i;
	System.out.println(a+"");
	
}

	}

}
