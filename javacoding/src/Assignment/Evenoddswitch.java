package Assignment;
import java.util.Scanner;

public class Evenoddswitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		
		switch(num%2)
		{
		case 0:
			System.out.println("num is even");
			break;
			
		default:
			System.out.println("number is odd");
			break;
		}

	}

}
