package AssTwodarray;

import java.util.Scanner;

public class Transponcematrix {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Scanner sc=new Scanner (System.in);
		System.out.println("enter size of matrix");
		int size=sc.nextInt();
		int a[][]=new int[size][size];
		  
        System.out.println("enter the elements of matrix");
  
        int k = 1;
  for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                arr[i][j] = k++;
            }
        }
  
        System.out.println("Matrix before Transpose ");
  
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
  
        System.out.println("Matrix After Transpose ");
  
     
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + arr[j][i]);
            }
            System.out.println();
        }
    
}


	}


