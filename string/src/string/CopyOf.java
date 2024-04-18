package string;

public class CopyOf {

	public static void main(String[] args) {
		char[] arr_num = new char[] {'1','2','3','4'};
		
		String str = String.copyValueOf(arr_num, 1, 3);
		System.out.println("\nthe book page no" + str + " page.\n" );
	}

}
