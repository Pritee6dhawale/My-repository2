package Nested;

import java.util.Scanner;

public class Binarytodecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int m;
		int sum=0;
		int p=0;
		while(num>0)
		{
			int digit=num%10;
			m=(int)(digit*(Math.pow(2, p)));
			sum=sum+m;
			p++;
			num=num/10;
			
		}
		System.out.println(sum);

	}

}
