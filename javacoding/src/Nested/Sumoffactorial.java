package Nested;

import java.util.Scanner;

public class Sumoffactorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the number");
		int num=sc.nextInt();
		int sum=0;
		
		int i=1;
		while(i<=num)
		{
		int fact=1;
		int j=1;
		
		while(j<=i)
		{
			fact=fact*j;
		j=j+1;
		}
		sum=sum+fact;
		i=i+1;
		}

		{
		System.out.println(sum);
	}
	

}
}
