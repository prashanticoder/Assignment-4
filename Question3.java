
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Question3  {
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("read.txt"));
		BankAccount emp=new BankAccount("prasanthi","562","guntakal");
		emp.setSalary(1000.0);
		oos.writeObject(emp);
		emp.display();
		System.out.println("object is written");
		
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("read.txt"));
		BankAccount emp1=(BankAccount)ois.readObject();
		System.out.println(emp.getSalary());
		emp1.display();
		System.out.println("deserialized is done");
		
	}
}
