package string;

public class String_Vs_StringBuffer_EqualsMethod {

	public static void main(String[] args) {


		String str1=new String("Selenium");
		String str2=new String("Selenium");
		
		System.out.println(str1.equals(str1));//true
		
		if (str1.equals(str2)) {
			
			System.out.println("If both object of content are same then will return true because in equals method of string class"
					+ "check content of object, so if same then *TRUE*");
		} 
		
		else 
		
		{
			System.out.println("If both object of content are not same then will return false because in string class of equals method "
					+ "check object of content, so if different then *FALSE*");
		}
		
		String s100="abc";
		String s110="abc";
		System.out.println(s100.equals(s110));//true
		
		
		String s1000="abc";
		String s1100="dbh";
		System.out.println(s1000.equals(s1100));//false
		
		
		
		String str3=new String("Selenium");
		String str4=new String("Automation");
		
		System.out.println(str3.equals(str4));//false
		
		if (str3.equals(str4)) {
			
			System.out.println("If both object of content are same then will return true because in string class of equals method "
					+ "check object of content, so if same then *TRUE*");
		} 
		
		else 
		
		{
			System.out.println("If both object of content are not same then will return false because in string class of equals method "
					+ "check object of content, so if different then *FALSE*");
		}
		
		
		StringBuffer str5=new StringBuffer("Selenium");
		StringBuffer str6=new StringBuffer("Selenium");
		
		System.out.println(str5.equals(str6));//false
		
		if (str5.equals(str6)) {
			
			System.out.println("If both object of content are same or not then it always return false because in stringBuffer class of equals method "
					+ "check refrence variable of object not object of content,*FALSE*");
			
		}
		else 
			
		{	
			System.out.println("If both object of content are same or not then it always return false because in stringBuffer class of equals method "
					+ "check refrence variable of object not object of content,*FALSE*");
		}
		
		
		
		String s10="abc";
		String s11="abc";
		System.out.println(s10==s11);//true

		String s12="abc";
		String s13="cd";
		System.out.println(s12==s13);//false
	
		String s1=new String("ab");
		String s2=new String("ab");
		System.out.println(s1==s2);//false

		StringBuffer sb=new StringBuffer("cd");
		StringBuffer sb1=new StringBuffer("cd");
		System.out.println(sb==sb1);//false
		
		
	}

}
