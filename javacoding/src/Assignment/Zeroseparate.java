package Assignment;
import java.util.Scanner;
import java.util.Arrays;


public class Zeroseparate {

	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int size=sc.nextInt();
int []a=new int[size];
System.out.println("enter the elements of an array");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();	
}
int pos=0;
for(int i=0;i<a.length;i++)
{
	if(a[i]!=0)
	{
	a[pos]=a[i];
	pos++;
	}
}
while(pos<a.length)
{
	a[pos]=0;
	pos++;
}
System.out.println(Arrays.toString(a));
		
}

}
