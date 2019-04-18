package Programs;

public class ReverseString {

	public static void main(String[] args) {


		String Name="AVI";
		int Length=Name.length();
		
		
		for(int i=Length-1;i>=0;i--)
		{
			char Reverse=Name.charAt(i);// IVA
			System.out.println(Reverse);
		}
		
	}

}
