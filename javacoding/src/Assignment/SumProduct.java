package Assignment;
import java.util.Scanner;

public class SumProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int num=sc.nextInt();
		int a[]=new int[num];
		System.out.println("enter array element");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			}
		int sum=0,product=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
				product=product*a[i];
				
			}
		}
		System.out.println("sum="+sum);
		System.out.println("product="+product);
		
		

	}

}
