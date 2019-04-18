package Programs;

public abstract class ReverseString2 {

	public static void main(String[] args) {


		String Str="AVI";
		int strLength=Str.length();
		System.out.println(strLength);
		
		
		for(int i=strLength-1;i>=0;i--) {
			
			char character=Str.charAt(i);
			System.out.println(character);
			
		}
		
		System.out.println("^^^^^^^^^^^^^^^^");
		
		
           for(int i=0;i<=strLength-1;i++) {
			
			char character=Str.charAt(i);
			System.out.println(character);
			
		}
		
		
	}

}
