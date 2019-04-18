package string;

public class Strings {

	public static void main(String[] args) {


		
		String str="Automation";//by using "" or literal
		String str1="Selenium";//by using "" or literal
		System.out.println(str+str1);
		
		String str3=new String("Avi");//by using new keyword
		String str4=new String("Gupta");//by using new keyword
		System.out.println(str3+str4);
		
		
		StringBuffer str5=new StringBuffer("HCL");//by using new keyword
		StringBuffer str6=new StringBuffer("Technology");//by using new keyword
		//System.out.println(str5+str6);
		
		
		String str7="IBM";//by using by using "" or literal memory will create in SCP and JVM will create one memory in SCP because JVM always check previous object of content
		String str8="Squad";//by using by using "" or literal memory will create in SCP and JVM will create one memory in SCP because JVM always check previous object of content
		String str9="IBM";//by using by using "" or literal memory will create in SCP but here str7 and str8 contents are same 
//then JVM will not create another object for this string then JVM will point to exiting object which is available with same content object
		//SCP memory wont allow duplicate
		
		String str10=new String("OX");//by using new keyword memory will create in Heap and JVM wont check previous object content it will directly assign the new memory. 
		String str11=new String("OWLS");//by using new keyword memory will create in Heap and JVM wont check previous object content it will directly assign the new memory. 
		//Heap memory allows duplicate
		
		
	}

}
