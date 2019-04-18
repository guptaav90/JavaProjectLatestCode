package Programs;

public class ReverseString1 {

	public static void main(String[] args) {


		String Name="SELENIUM";
		
		int NameLength=Name.length();
		
		System.out.println(NameLength);
		
		
	/*	
		0-S
		1-E
		2-L
		3-E
		4-N
		5-I
		6-U
		7-M
		
        
		*/
		for(int i=0;i<=NameLength-1;i++)      
		{
			char alpha=Name.charAt(i);
			System.out.println(alpha);
		}
		
		
		System.out.println("------------------");
		
		
		/*	
		M
		U
		I
		N
		E
		L
		E
		S
        
		*/
		
		for(int i=NameLength-1;i>=0;i--)      
		{
			char alpha=Name.charAt(i);
			System.out.println(alpha);
		}
		
		
	}

}
