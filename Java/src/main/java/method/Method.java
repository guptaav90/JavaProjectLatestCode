package method;

public class Method {
	
	
	//1.No input no output, void doesn't return anything
	public void sum() {
		
		System.out.println("Sum Method");
	}
	
	//2.No input some output
	
	public int sub() { //its return integer
		
		System.out.println("Sub Method");
		
		int a=10;
		int b=20;
		int c=a-b;
		
		return c;	
	}
	
	//3.Some input some output
	
	public int div(int c, int d) { //its return integer and we are giving input through method parameter int c and int d
		
		System.out.println("Div Method");
		
		int z=c/d;
		
		return z;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method m1=new Method();
		m1.sum();
		int k=m1.sub();
		System.out.println(k);
		int l=m1.div(2, 2);
		System.out.println(l);

	}

}
