package Assignment;
import java.util.Scanner;

public class Vowelswitch {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter charatcer");
	char ch=sc.next().charAt(0);
	
	int i=0;
	
	switch(ch)
	{
	case'a':
	case'e':
	case'i':
	case'o':
	case'u':
	case'A':
	case'E':
	case'I':
	case'O':
	case'U':
		i++;
	}
	if(i==1)
	{
		System.out.println("enter character "+ch+" is vowel");
		
	}
	else 
		if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
		{
			System.out.println("enter character "+ch+" is consonent");
		}
		else
		{
			System.out.println("not an alphabet");
		}
	}

}
