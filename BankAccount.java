import java.io.Serializable;

public class BankAccount implements Serializable {
	private String name;
	private String id;
	private String address;
	private transient double salary;
	public BankAccount() {
		
	}
	public BankAccount(String name, String id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void display()
	{
		System.out.println("name"+name+"id"+id+"address"+address+"salary"+salary);
	}
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", id=" + id + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
}
