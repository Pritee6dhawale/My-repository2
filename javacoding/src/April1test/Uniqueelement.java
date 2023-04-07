package April1test;
import java.util.Scanner;

public class Uniqueelement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    System.out.println("Java Program to print unique element of Array");
    System.out.println("Enter the size of array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("enter the array elelemnts");
    for(int i=0; i<size; i++) 
    {
  
        arr[i] = sc.nextInt();
    } 
    System.out.println("Unique values in array are : ");
    for (int i = 0; i < size; i++)
    {
        int j;
        for ( j = 0; j < i; j++)
        if (arr[i] == arr[j])
            break;
        if (i == j)
            System.out.println( arr[i] + " ");
    }
}
}
