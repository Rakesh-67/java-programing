package string;

public class Concat {

	public static void main(String[] args) {
		String str1 = "Rakesh Adress";
        String str2 = "Jitu Adress";
        
        
        System.out.println("String 1: " + str1);
        
        System.out.println("String 2: " + str2); 
       
        
        String str3 = str1.concat(str2);

        System.out.println("The concatenated String:"+str3);

	}

}
