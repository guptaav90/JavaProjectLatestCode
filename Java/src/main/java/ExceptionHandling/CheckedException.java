package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CheckedException {
	
	

	public static void main(String[] args)    {


		try {
		Thread.sleep(1000);
		System.out.println("***");
	     }
		
		catch (InterruptedException e) {
			
		  e.printStackTrace();
		}
		System.out.println("***");

	
	
	 
	try {
		Properties prop =new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\gupta.av\\eclipse-workspace\\Java\\Fileee.properties");
		 prop.load(fis);
		
	} catch (IOException e) {
		
		
		
		e.printStackTrace();
	}
	
	
			
	
	System.out.println("+++++");
	
}
}
