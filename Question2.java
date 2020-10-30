import java.io.*;

public class Question2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in)); 
      
     
     String name = reader.readLine(); 

     BufferedWriter writer =  
             new BufferedWriter(new FileWriter("read1.txt")); 
   writer.write(name);
     System.out.println(name); 
     reader.close();
     writer.close();
	
}
}
