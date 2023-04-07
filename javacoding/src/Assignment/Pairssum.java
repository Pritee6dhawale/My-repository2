package Assignment;
import java.util.Scanner;

public class Pairssum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter element of array");
		int size=sc.nextInt();
		int a[]=new int [size];
	int sum = 10;
	System.out.println("The pairs whose sum are equal to "+ sum+" are : ");
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = i + 1; j < a.length; j++) 
            {
            	a[i]=sc.nextInt();
            	{
            
                if (a[i]+a[j] == sum) 
                {
                    System.out.println(a[i] + " " + a[j]);
                }
                
            }
            }
            
        
    

	

        }
	}
}
