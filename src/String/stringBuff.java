package String;

public class stringBuff {

	public static void main(String[] args) {
		String str="rakesh";
		String str1="nayak";
		StringBuffer strbuf = new StringBuffer(str1);

	
	 System.out.println("Comparing " + str + " and " + strbuf + ": " + str.contentEquals(strbuf));
	 System.out.println("Comparing " + str1 + " and " + strbuf + ": " + str1.contentEquals(strbuf));
    
}
}