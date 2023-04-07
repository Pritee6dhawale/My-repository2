package javacoding;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the number");
		int num=sc.nextInt();
		int numcopy=num;
		int result=0;
		while(num!=0)
		{
			int r=num%10;
			result=result+(r*r*r);
			num=num/10;
		}
		if(result==num)
		{
		System.out.println(" is an armstrong number");
		

	}
		else
		{
			System.out.println("is not armstrong number");
		}

}
}
