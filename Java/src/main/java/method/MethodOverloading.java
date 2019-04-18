package method;

public class MethodOverloading {
	
	
	//Method A and B having Same method name but different number of arguments. 
	public void sum() {
		System.out.println("sum0");
	}
	
	//Method B and C having Same method name & same number of arguments but different data types.
	public void sum(int i) {
	
		System.out.println(i);
		
		
	}
	//Method C and D having Same method name but different number of arguments with same data types.
	public void sum(double l) {
		System.out.println(l);
		
	}
	//Method D and E having Same method name with same arguments with same data types but all argument are in different place instead of one method means replace the place of argument in second method.
	public void sum(double p,double k) {
	
		System.out.println(p+k);
	}
	//Method E
	public void sum(int g,double m) {
		System.out.println(g+m);
		
	}

	public static void main(String[] args) {
		
		MethodOverloading mol=new MethodOverloading();
		mol.sum();
		mol.sum(10);
		mol.sum(10.90);
		mol.sum(20, 30);
		mol.sum(90, 20.68);
		
	
		
		
		

	}

}
