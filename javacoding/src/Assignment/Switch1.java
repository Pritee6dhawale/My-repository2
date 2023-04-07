package Assignment;
import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("enetr month number");
    int month=sc.nextInt();
    
    int days=0;
    String monthname;
    switch(month)
    {
    case 1:monthname="january";
    days=31;
    break;
    
    case 2:monthname="february";
    days=28;
    break;
    
    case 3:monthname="march";
    days=31;
    break;
    
    case 4:monthname="april";
    days=30;
    break;
    
    
    case 5:monthname="may";
    days=31;
    break;
    
    case 6:monthname="june";
    days=30;
    break;
    
    case 7:monthname="july";
    days=31;
    break;
    
    case 8:monthname="august";
    days=31;
    break;
    
    case 9:monthname="september";
    days=30;
    break;
    
    case 10:monthname="october";
    days=31;
    break;
    
    case 11:monthname="november";
    days=30;
    break;
    
    case 12:monthname="december";
    days=31;
    break;
    	
    
    }
    System.out.println(month+" "+days);
    
    
    	

	}

}
