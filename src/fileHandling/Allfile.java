package fileHandling;
import java.io.File;

public class Allfile {

	public static void main(String[] args) {
		 File f = new File("D:\\project");
		 File r = new File("D:\\java");
	        String[] fileList = f.list();
	        String[] filelist = r.list();
	        for(String name:fileList){
	            System.out.println(name);
	            for(String name1:fileList){
		            System.out.println(name1);
		
	  }

	}
}
}
