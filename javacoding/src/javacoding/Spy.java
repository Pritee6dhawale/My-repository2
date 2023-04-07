package javacoding;

import java.util.Scanner;

public class Spy {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the number");
		int num=sc.nextInt();
		int temp=1,sum=0,lastdigit;
		while(num>0)
		{
			lastdigit=num%10;
			sum=sum+lastdigit;
			temp=temp*lastdigit;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("th number is spy");
		}
		else
		{
			System.out.println("number isnot spy");
		}
		

	}

}
