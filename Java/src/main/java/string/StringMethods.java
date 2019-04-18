package string;

public class StringMethods {

	public static void main(String[] args) {


		String str1=new String("New");
		String str2=new String("Technology");
		String str3=new String("   NEW   ");
		String str4=new String("NEW");
		String str5=new String("Neww");
		
		System.out.println(str1.length());//it will return length of string.
		System.out.println(str1.concat(str2));//it does concatenation between two strings.
		System.out.println(str3.trim());//it will remove spaces from left and right of string.
		System.out.println(str1.equals(str2));//it will check contents of both strings.
		System.out.println(str1.charAt(2));//it will return char of string
		System.out.println(str1.contentEquals("Nwe"));//it will return boolean,its checks both string of content in same sequence. 
		System.out.println(str1.equalsIgnoreCase(str4));//it will ignore CASES
		System.out.println(str1.contains(str5));//it will check second string contents, if contents is available in first string then true else false 
		System.out.println(str2.substring(4));//it will return string content from begin index till end of string
		System.out.println(str2.substring(4, 8));//it will return String content start from begin given index and given ends index 
		
		
		
	}

}
