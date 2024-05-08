package fileHandling;
import java.io.*;
public class Studenttest {

	public static void main(String[] args) {
		try {
	Student s1 = new Student(1001,"riki");
	  
	
	  FileOutputStream fout=new FileOutputStream("f.txt");    
	  ObjectOutputStream out=new ObjectOutputStream(fout);    
	  out.writeObject(s1);    
	  out.flush();    

	out.close();    
	  System.out.println("successfully");    
	  }catch(Exception line){System.out.println(line); 
}
}
}
