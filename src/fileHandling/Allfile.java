package fileHandling;
import java.io.File;

public class Allfile {

	public static void main(String[] args) {
		 File f = new File("D:");
	        String[] fileList = f.list();
	        for(String name:fileList){
	            System.out.println(name);
		
	  }

	}
}
