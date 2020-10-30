import java.util.*;

public class Question6 {
public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in))
	{
	int n=sc.nextInt();
	try
	{
		if(n>100)
		{
			throw new InputException("Number can’t be greater than [n]");
		}
	}
	catch(InputException ex)
	{
		System.out.println(ex.getMessage());
	}
}
}
}
class InputException extends Exception
{
	public InputException(String message)
	{
		super(message);
	}
}
