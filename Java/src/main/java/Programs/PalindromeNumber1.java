package Programs;

public class PalindromeNumber1 {

	public static void main(String[] args) {


		int rem=0;
		int sum=0;
		int num=121;
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		
		if (temp==sum) {
			
			System.out.println(temp + " is a palindrom number");
		} 
		
		else 
		
		{
			System.out.println(temp + " is not a palindrom number");
		}
		
		
	}

}
