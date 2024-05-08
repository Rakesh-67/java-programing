package fileHandling;
import java.io.*;
public class Persontest  {

	public static void main(String[] args) {
		 try{    
			    
			  Person1 s1 = new Person1 (211,"ravi","mca");    
			    
			  FileOutputStream fout=new FileOutputStream("f.txt");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(s1);    
			  out.flush();     
			  out.close();    
			  System.out.println("success");    
			  }catch(Exception e){System.out.println(e);}    
			  try{    
			    
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));    
			  Person1 p1=(Person1)in.readObject();    
			    
			  System.out.println(p1.id+" "+p1.name+" "+p1.course+" ");    
			  
			  in.close();    
			  }catch(Exception e){System.out.println(e);}    
	}

}
