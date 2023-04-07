package basicprogram;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ebetr the number");
		int num=sc.nextInt();
		int firstnum=0,secondnum=1;
		//int n=10;
		
	for(int i=1;i<=num;i++)
	{
		int nextnum=firstnum+secondnum;
		firstnum=secondnum;
		secondnum=nextnum;
		System.out.println(firstnum);
		
	}
			
	
		
		

	}

}
