import java.util.Scanner;

public class Question5 {
public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in))
	{
	int n=sc.nextInt();
	try
	{
		if(n>100)
		{
			throw new Exception();
		}
	}
	catch(Exception e)
	{
		System.out.println("Number can’t be greater than 100");
	}
	}
}
}
