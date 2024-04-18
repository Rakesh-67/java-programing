package string;

public class Index2 {

	public static void main(String[] args) {
		String str = "Rakrsh Nayak";
		System.out.println("string:"+str);
		
		int valu1 = str.codePointBefore(1);
		 
        int valu2 = str.codePointBefore(6);
        System.out.println("Character(unicode point) = " + valu1);
        System.out.println("Character(unicode point) = " + valu2);

	}

}
