package Assignment;
import java.util.Scanner;


public class Array1 {

	public static void main(String[] args) {
		int a[]=new  int[10];
		//int []a= {1,2,3,4,5,6,7,8,9,};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rray element");
		int  num=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			
			{
				a[i]=sc.nextInt();
			}
			System.out.print(a[i]+" ");
		}
	
		
	

	}

}
