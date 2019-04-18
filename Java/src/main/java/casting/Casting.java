package casting;

public class Casting {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10; //int DT size 4 byte
		
		long l=i;//long DT size 8 byte //Up casting : In up casting smaller DT can be store into longer DT 
		System.out.println(l);
		
	 //	NOTE: Complier is responsible for Up casting.
	
		long p=20;  //long DT size 8 byte 
		
	//int u=p;//int DT size 4 byte //here up casting is not possible because larger DT cannot store into smaller DT, so i commented this line
		
		int u=   (int) p;//Down casting : In down casting longer DT can be store into smaller DT.
		
   //	NOTE: User or programmer is responsible for down casting.
		
		
		
		
		
	}

}
