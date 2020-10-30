import java.util.*;
import java.util.Scanner;

public class Question4 {
public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in))
	{
		System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
	
	
	try
	{
		int n=sc.nextInt();
		if(n==-1)
			System.exit(0);
	    else if(n%2==0)
			System.out.println("even");
		else 
			System.out.println("odd");
		
	
	}
	catch(InputMismatchException ex) {
		System.out.println("You must enter an integer");
	}
		
	}
}
}
