package Nested;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int count=0;
		int copy=num;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count+" "+num);
		num=copy;
		int sq=num*num;
		int power=1;
		for(int i=1;i<=count;i++)
		{
			power=power*10;
		}
		System.out.println(power);
		int end=sq%power;
		System.out.println(num+" "+end);
		if(num==end)
		{
			System.out.println("number is automorphic");
		}
		else
		{
			System.out.println("number is not automorphic");
		}

	}

}
