package Nested;

import java.util.Scanner;

public class Disarium {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr  the number");
		int num=sc.nextInt();
		int temp=num;
		int digit=0;
		
		while(num!=0)
		{
			num=num/10;
			digit++;
		}
		num=temp;
		int sum=0;
		
		while(num!=0)
		{
			int d=num%10;
		sum+=(Math.pow(d,digit));
		digit--;
		num=num/10;
		}
		
		if(sum==temp)
		
	{
		System.out.println("number id Disarium");
	}
	else
	{
		System.out.println("number is not Disarium");
	}

}
}
