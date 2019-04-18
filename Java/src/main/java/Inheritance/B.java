package Inheritance;

      //this is called single type inheritance, class A is a parent class of B class and  
	 //B class is a child class of A class

public class B extends A { // Inheritance (IS-A Relationship): If we are using inheritance between two class that is 
	//called IS-A relationship by using extends keyword (tightly coupled relationship, blood relationship).
	
	
	public void Internet() {
		
		System.out.println("Child class of Internet method");
	}

	public static void main(String[] args) {

		
		B b=new B();
		b.Internet();//class B method
		b.Show();//class A method
		b.Mirror();//class A method
		
		
		A a=new A();//HAS-A relationship //Association (HAS-A): 
		//If we are creating the object of class or new keyword in any other class that is called HAS-A relationship
		//by using object of class or new keyword (Not tightly coupled relationship, Non-blood relationship)
		
		
	}
	

}
