package abstraction;

public class C extends B {/*4.If child class is extending parent class and that class is abstract, 
    then parent class of all abstract method must be implemented or with method body in child class.
	
*/
	
	
	public void Credit() {
		
		System.out.println("Credit Method");
	}

	
	public static void main(String[]args) {
		
		
		C c=new C();
		c.Debit();
		c.Credit();
		c.Neft();
	}
}
