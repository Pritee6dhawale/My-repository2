package Test2;
import  java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
			}
			System.out.println(" ");
		}
		

	}

}
