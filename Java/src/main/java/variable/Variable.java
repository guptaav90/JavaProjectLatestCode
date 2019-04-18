package variable;

public class Variable {
	
	//----For local variable-----
	public void sum() {
		
	     int i=10;//local variable inside the methods/constructor and blocks
		int j=20;//local variable inside the methods/constructor and blocks
		
		System.out.println(i);
		System.out.println(j);
		
	}
	
	
	//----For non static variable----
	int k=50;//non static variable inside the class only not inside the methods/constructor and blocks
	int l=100;//non static variable inside the class only not inside the methods/constructor and blocks
	
	public void subtract() {
		
		System.out.println(k);// non static variable can be access directly with in inside the non static method.
		System.out.println(l);// non static variable can be access directly with in inside the non static method.
		
	}
	
	
	public static void multiply() {
		
	    Variable var1=new Variable();
	    System.out.println(var1.k);//non static variable cannot be access directly, so need to create object of class and call them too to access non-static variable.
	    System.out.println(var1.l);//non static variable cannot be access directly, so need to create object of class and call them too to access non-static variable.
		
	}
	
	
	//----For static variable----
	
	 static int v=90;
	 static int y=70;
	 
	 public static void divide() {
		 
		 System.out.println(v);
		 System.out.println(y);
		 
	 }
	 
	 public void reminder() {
		 
		 System.out.println(v);//by directly
		 System.out.println(Variable.v);//By using class name
		 Variable var2=new Variable();//Not recommended
		 System.out.println(var2.v);
	 }
	
	 
	 
	//100.Logic for non static VS static
	    int m=10;
		static int n=20;
		

	public static void main(String[] args) {
		
		Variable var=new Variable();
		var.sum();
		var.subtract();
		multiply();
		
		
		System.out.println("<----------------->");
		
		//100.Logic for non static VS static
		Variable vari=new Variable();
		System.out.println(vari.m);//10
		System.out.println(vari.n);//20
		
		vari.m=1000;
		vari.n=2000;
		System.out.println(vari.m);//1000
		System.out.println(vari.n);//2000
		
		Variable vari1=new Variable();
		System.out.println(vari1.m);//10
		System.out.println(vari1.n);//2000
		
		
		vari1.m=4000;
		vari1.n=5000;
		System.out.println(vari1.m);//4000
		System.out.println(vari1.n);//5000
		
		Variable vari2=new Variable();
		System.out.println(vari2.m);//10
		System.out.println(vari2.n);//5000
		
		
		
		
		
		
		
		
		
		

		

	}

}
