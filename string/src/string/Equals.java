package string;

public class Equals {

	public static void main(String[] args) {
		String str1="Rakesh nayak";
		String str2="rakesh nayak";
		String str3="bibeka mohanty";
		boolean equals1 = str1.equalsIgnoreCase(str2);
		boolean equals2 = str2.equalsIgnoreCase(str3);
		System.out.println(equals1);
		System.out.println(equals2);
		
	}

}
