package string;

public class Immutable {

	public static void main(String[] args) {


		
		String str1="Selenium";
		str1.concat("Automation");
		System.out.println(str1);//Selenium
		
		String str2=new String("IBM");
		str2.concat("Squad");
		System.out.println(str2);//IBM
		
		String str3=new String("HCL");
		String str4=new String("Squad");
		System.out.println(str3.concat(str4));//HCLSquad
		
		/*
		String is immutable class it means once we are creating String objects 
		it is not possible to perform the modifications on existing object, whatever you have used literals or new keyword (String object is fixed object)  
		*/
		
		
		String s1="Selenium";
		String s2="Express";
		
		s1.concat("Automation");
		System.out.println(s1);//Selenium
		System.out.println(s1.concat(s2));
		String str=s1.concat(s2);
		System.out.println(str);
		
		
	}

}
