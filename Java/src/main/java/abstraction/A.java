package abstraction;

public abstract  class A { /*1.If you declare abstract method in a class, then that class must be abstract as well.
	*/
	
	public abstract   void Debit();/*Abstract method, this abstract method doesn't have any body own implementation
	2.	If you declare abstract class, then that class can have abstract or non-abstract method both.
	*/
	
	public abstract void Credit();/*Abstract method, this abstract method doesn't have any body own implementation
	2.	If you declare abstract class, then that class can have abstract or non-abstract method both.
	*/
	
	public void Neft() {//This is non abstract method
		
		System.out.println("NEFT Method");
		
	}
		
	
	public static void main(String []args) {
		
	/*	A a=new A();//We cannot create the object of abstract class because why you need a object 
	 there abstract method doesn't have body without body which method you need to call it.
	 * 3.	We cannot create the object abstract class.
	 
		*/
	}
	
}
	
	

