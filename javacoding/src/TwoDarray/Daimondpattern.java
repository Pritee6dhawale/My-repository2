package TwoDarray;
import java.util.Scanner;
public class Daimondpattern {

	public static void main(String[] args) {
	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter no of rows");
  int row=sc.nextInt();
  
  for(int i=0;i<=row;i++)
  {
	 for(int j=row-1;j>=i;j--) 
		 System.out.print(" ");
	 for(int k=1;k<=2*i-1;k++)//space
		 System.out.print("*");
	 System.out.print("\n");
	 
  }
  for(int i=row-1;i>=1;i--)
  {
	  for(int j=row-1;j>=i;j--)
		  System.out.print(" ");
	  for(int k=1;k<=2*i-1;k++)//spaces
		  System.out.print("*");
	  System.out.print("\n");
  }
	}

}
