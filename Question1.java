import java.io.*;


public class Question1 {
public static void main(String[] args) {
	FileInputStream fis=null;
	try
	{
	fis=new FileInputStream("read.txt");
	int i=0;
	while((i=fis.read())!=-1)
	{
		System.out.print((char)i);
	}
	}
catch(FileNotFoundException e)
	{
	e.printStackTrace();
	}
	catch(IOException e)
	{
	e.printStackTrace();
	}
	

}
}
