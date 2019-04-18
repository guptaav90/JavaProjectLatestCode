package Keyword;

public class SuperChild extends SuperParent {
	
	int i=20;
	
	public void show(int i) {
		
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}

	public static void main(String[] args) {

		SuperChild sc=new SuperChild();
		sc.show(30);

		
	}

}
