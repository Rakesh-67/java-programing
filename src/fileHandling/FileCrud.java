package fileHandling;
import java.io.*;
import java.util.*;
public class FileCrud {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name:");
		  String name = sc.nextLine();
		System.out.println("Enter contact number:");
		  String contact = sc.nextLine();
		  
		  File file =new File("contact.txt");
		  if(file.exists()) {
			
			  file.createNewFile();
		  }
		  RandomAccessFile raf = new RandomAccessFile(file, "rw");
		  
		 // System.out.println(raf.getFilePointer());
		  //System.out.println(raf.length());
		  boolean found = false;
		  
		  while(raf.getFilePointer()<raf.length()) {
			 String line = raf.readLine();
			 System.out.println(line);
			 System.out.println(raf.getFilePointer());
			 
			 String[] name_contact = line.split("!");
			 if(name_contact[0].trim().equalsIgnoreCase(name.trim())||name_contact[1].trim().equalsIgnoreCase(contact.trim())) {
				
				 System.out.println("this name or phone already exists");
				 found = true;
				 break;
			 }
		  }
		  if(!found){
			  System.out.println(raf.getFilePointer());
			  String newContact = name+"!"+contact;
			  raf.writeBytes(newContact);
			  raf.writeBytes(System.lineSeparator());
			  System.out.println(raf.getFilePointer());
		  }
			raf.close();
		  	  
	}

}
