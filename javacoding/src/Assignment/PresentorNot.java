package Assignment;

import java.util.Scanner;
import java.util.Arrays;

public class PresentorNot {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
     System.out.println("enter array element");
         int num=sc.nextInt();
         
         for(int i=0;i<a.length;i++)
         {if(a[i]==num)
         {
        	 System.out.println("element is present");
        	 break;
         }
         else
         {
        	 System.out.println("element is not present");
        	 
        
         }
         System.out.println(Arrays.toString(a));
         
         }

}
}
