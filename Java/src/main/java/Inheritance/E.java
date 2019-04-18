package Inheritance;

public class E extends B { //this is called Hierarchical inheritance, more than two child class are extending only one parent class.
	//E and D are extending class A
	
	public void SixG() {
		
		System.out.println("SixG method");
	}

	public static void main(String[] args) {
		
		
		
		E e=new E();
		e.SixG();
		e.Show();
		e.Mirror();
		
		

	}

}
