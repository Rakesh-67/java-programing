package string;

public class Index1 {

	public static void main(String[] args) {
		String str="Rakesh nayak";
		System.out .println("String:"+str);
		
		 int valu1 = str.codePointAt(1);
		 
         int valu2 = str.codePointAt(6);
         
         System.out.println("Character(unicode point) = " + valu1);
         System.out.println("Character(unicode point) = " + valu2);
         
	}

}
