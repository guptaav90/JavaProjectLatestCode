package method;

public class MethodOverriddingB extends MethodOverriddingA {
	
	
//When same method is present in parent class and as well as child class with same method name and same no of arguments that is called method overriding or run time polymorphism
	public void start() {//overriding method
		
		//super.start();//here if you want to access or implementation of parent class through child class object
		//then you have to use super keyword in overriding method 
		System.out.println("B start method--");
		

	}
	
	public void theftsafety() {
		
		System.out.println("B theftsafety method");
		
	}
	
	
	
	public static void main(String []args) {
		
		
		MethodOverriddingA moa  =new MethodOverriddingA();//if parent class reference. as well as parent class object then you can access only parent class method.
		moa.start();
		moa.fuel();
		moa.speed();
		
		
		MethodOverriddingB mob=new MethodOverriddingB();
		mob.start();
		mob.fuel();
		mob.speed();
		mob.theftsafety();
	
		
		MethodOverriddingA mos=new MethodOverriddingB();//Up casting, parent class reference variable can hold child class object.
		mos.start();//child class of start method  will be executed because compiler will check in both class at compile time
		//but at run time JVM will check both class method but JVM will give the preference to child class method because 
		//check if child class have same method then why you need the extend from parent class.
		mos.fuel();
		mos.speed();
		//mos.theftsafety(); //parent class cannot access child class method by using parent class reference variable.
		//here if you create object of that class then you can access of that class method.
		
		//MethodOverriddingB b=MethodOverriddingA(); //down casting, child class reference variable cannot hold parent class object.
		MethodOverriddingB b=(MethodOverriddingB)new MethodOverriddingA();//*ClassCastException*
		b.speed();
		b.theftsafety();
		b.start();
		b.fuel();
		
		
	}
	
}
