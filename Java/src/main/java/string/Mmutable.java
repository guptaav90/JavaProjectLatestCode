package string;

public class Mmutable {

	public static void main(String[] args) {


		 StringBuffer str1=new StringBuffer("Selenium");
		 str1.append("Automation");
		 System.out.println(str1);//SeleniumAutomation
		 
		 /*
		 	StringBuffer is a mutability class it means once we are creating StringBuffer objects on that existing object 
		 	it is possible to perform modification
		*/
	}

}
