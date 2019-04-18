package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UncheckedException {

	public static void main(String[] args)  {

         try {
        
        	 int var=9/0;
        	 System.out.println("Exception");
         }
         catch(ArithmeticException ae)
         {
        	 ae.printStackTrace();
         }
         
         System.out.println("***");
		
		
         try {
     		Properties prop =new Properties();
     		FileInputStream fis = new FileInputStream("C:\\Users\\gupta.av\\eclipse-workspace\\Java\\File.properties");
     		prop.load(fis);
     		System.out.println("Exception");
         }
         
         catch (FileNotFoundException e) {
			e.printStackTrace();
		}
     		
     		
     	 catch (IOException e) {
     		
     		e.printStackTrace();
     	}
         System.out.println("+++");
	}

}
