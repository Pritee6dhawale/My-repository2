package Test2;

import java.util.Scanner;

public class Pow {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base");
		int base=sc.nextInt();
		System.out.println("enter the index");
		int index=sc.nextInt();
		int i=1,power=1;
		while(i<=index)
		{
			power=power*base;
			i++;
		}
		System.out.println(power);

	}

}
