package method;

public class MainMethodOverLoading {

	public static void main(String[] args) {//JVM always try to search main method with exact main method syntax if you run program 

		
		System.out.println("Main method");
		MainMethodOverLoading.main();
		MainMethodOverLoading.main(10);
		
	}
	
	public static void main() {
		
		System.out.println("0 parameter -Overloaded method");
	}
	
	public static void main(int i) {
		System.out.println(i+": 1 parameter -Overloaded method");
	}
	
	public static void main(long l) {
		
	}
	
	public void main(long l, String string) {
		
	}
	
	public static void main(String string, long l) {
		
	}

}
