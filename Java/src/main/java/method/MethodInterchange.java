package method;

public class MethodInterchange {
	
	
	public static void sum() {
		System.out.println("Sum Method");
		sub();
	}
	
	public static void sub() {
		System.out.println("Subtraction Method");
		sum();
	}
	
	
	public static void main(String []args) {
		
		sum();
		
	}

}
