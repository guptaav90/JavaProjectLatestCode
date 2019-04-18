package abstraction;

public abstract class B extends A {  /*4.If child class is extending parent class and that class is abstract, 
                                then parent class of all abstract method must be implemented or with method body in child class.
	
*/
	@Override
	public void Debit() {
		
		System.out.println("Debit Method");
	}
	


}
