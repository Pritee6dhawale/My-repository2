package Test2;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mobile number");
		int num=sc.nextInt();
		System.out.println("digit/tfrequency");
		int i,digit,temp,count;
		for(i=0;i<=9;i++)
		{
			count=0;
			temp=num;
			while(temp>0)
			{
				digit=temp%10;
				if(digit==i)
				{
					count++
;
					}
				temp=temp/10;
			}
			if(count>0)
			{
				System.out.println(i+" \t"+count);
			}
			
		}
		

	}

}
