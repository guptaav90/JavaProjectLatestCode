package Interface;

public class B implements A,C {  /*4.If child class is extending the properties of parent class and that is interface, 
	then child class implement all the abstract method of interface in child class.
	*/
	/* 5.Child class is extending the properties of interface by using implements keyword.
	*/
	
/*	6. In interface multiple inheritance is possible.
	
*/	
	public void Loan(){
		
		System.out.println("Loan Method");
	}

	public void Funds() {
		
		System.out.println("Funds Method");
	}
	
	public void Interest() {
		
		System.out.println("Interest Method");
	}
	
	public void IMPS() {
		
		System.out.println("IMPS Method");
	}
	
	public void RBIGuidelines() {
		System.out.println("RBI Guidelines");
	}
	
	public void Transfer() {
		System.out.println("Transfer Method");
	}
	
	public static void main(String[]args) {
		
	
	B b=new B();
	b.Loan();
	b.Funds();
	b.Interest();
	b.IMPS();
	b.RBIGuidelines();
	
	A a=new B();//we can call only overridden method by using parent reference variable
	a.Loan();
	a.Funds();
	a.Interest();
	a.IMPS();
	
	C c=new B();
	c.RBIGuidelines();////we can call only overridden method by using parent reference variable
	
	
	
      }
	
}
