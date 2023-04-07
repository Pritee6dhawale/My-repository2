package javacoding;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			if((num%10)%2!=0);
			sum=sum+num%10;
			num=num/10;
			
			
					
		}
		System.out.println(sum);

	}

}
