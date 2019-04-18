package Inheritance;

public class D extends A{ //this is called Hierarchical inheritance, more than two child class are extending only one parent class.
	//D and E are extending class A
	public void FiveG() {
		
		System.out.println("FiveG method");
	}
	

	public static void main(String[] args) {
		
		D a=new D();
		a.FiveG();
		a.Show();
		a.Mirror();


		
		

	}

}
