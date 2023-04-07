package Assignment;
import java.util.Scanner;


public class Menudriven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.additin,2.subtraction,3.multiplication,4.division");
		int choice=sc.nextInt();
		System.out.println("enter 1st number");
		int num1=sc.nextInt();
		System.out.println("enter 2nd number");
		int num2=sc.nextInt();
		
		
		
		if(choice!=4)
		switch(choice)
		{
		case 1:
			System.out.println("addition" + (num1+num2));
			break;
		case 2:
			System.out.println("subtraction" + (num1-num2));
			break;
		
		case 3:
			System.out.println("multiplication" + (num1*num2));
			break;
		
		case 4:
			System.out.println("division" + (num1/num2));
			break;
			
			default:System.out.println("invalid choice");
		
	}
		
		

	}

}
