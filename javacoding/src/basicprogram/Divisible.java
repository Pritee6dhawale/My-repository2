package basicprogram;
import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr first number");
		int num1=sc.nextInt();
		{
		
		
	   System.out.println("Diviede by 5");
	   for(int i=1;i<=100;i++)
	   {
		if(i%5==0) 
			System.out.print(i+" ");
		
	   }
	   System.out.println("\n");
	   System.out.println("enetr second number");
		int num2=sc.nextInt();
	   
	   int i;
	   
	   
	   
		   System.out.println("Divided by 10");
		   for(i=1;i<=100;i++)
		   {
			  if(i%10==0)
				  System.out.println(i+"");
	
		   }
	   
	     
		}
		   

	}

}
