package method;

public class TypesOfMethod {
	
	//Types of method: 2 types of method.
	public void sum() {//1.Non static method 
		
		System.out.println("Sum Method");
		
	}
	
    public static void sub() {//2.Static method
		
		System.out.println("Sub Method");
	}
    
    
    public void AMethodAccessB() {  //Non static method access or call to static method by using three method which are in below:
    	
		
  		System.out.println("AMethodAccessB");
  		BMethodAccessA();//directly to call static method
  		TypesOfMethod.BMethodAccessA();//by class name to call static method
  		TypesOfMethod tom1=new TypesOfMethod();
  		tom1.BMethodAccessA();//calling by reference of class object to call static method
  		
  		
  		
  		
  	}
    
	public static void BMethodAccessA() {  //Static method access or call to Non static method by using one method which is in below:
		//calling by reference of class object to call non static method
		
		System.out.println("BMethodAccessA");
		TypesOfMethod tom2=new TypesOfMethod();
		tom2.AMethodAccessB();//calling by reference of class object to call non static method
	}
	
  

	public static void main(String[] args) { //main method is static and doesn't return anything, so its treated as static method

      TypesOfMethod tom=new TypesOfMethod();
      tom.sum();//calling by reference of class object to call non static method
      
      sub();//calling by directly to call static method
      TypesOfMethod.sub();//calling by class name to call static method
      tom.sub();//calling by reference of class object to call static method but *NOT RECOMMENDED*
      
      int a=10; 
      int b=20; 
      System.out.println(a+b); //30 [addition] 
      System.out.println(a+"ratan"); //10Ratan [concatenation] 
      System.out.println("ratan"+"anu"+2+2+"kids"+2+2); //ratananu22kids22
      System.out.println(2+2+"kids"+"ratan"+2+2+"anu");//4kidsratan22anu


	}

}
