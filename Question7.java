import java.io.IOException;
import java.util.*;
public class Question7 {
public static void main(String[] args) {
	ExceptionSub exception=new ExceptionSub();
	try
	{
		exception.throwException();
	}
	catch(InputException ex)
	{
		ex.printStackTrace();
	}
	catch(IOException ex)
	{
		ex.printStackTrace();
	}
	
}
}
class ExceptionSub
{
	public void throwException() throws InputException,IOException
	{
		
	}
}
