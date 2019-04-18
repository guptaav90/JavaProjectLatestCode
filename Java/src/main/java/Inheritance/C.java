package Inheritance;

public class C extends B { //this is called multilevel inheritance, class B is a parent class of C class and
	//C class is a child class of B if parent class is extending to other class or own parent class then child class 
	//can inherited the properties grand parent class indirectly.
	
	public void FourG() {
		
		System.out.println("FourG method");
	}

	public static void main(String[] args) {


		C c=new C();
		c.FourG();
		c.Internet();
		c.Show();
		c.Mirror();

	}

}
