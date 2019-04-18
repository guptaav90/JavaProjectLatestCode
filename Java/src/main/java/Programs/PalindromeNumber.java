package Programs;

public class PalindromeNumber {

	
	public static void main(String[] args) {

		int reminder=0;
		int sum=0;
		int num=121;
		int temp=num;
		
		while (num>0) {
			
			reminder=num%10;
			sum=(sum*10)+reminder;
			num=num/10;
			
		}

		if (temp==sum) {
			
			System.out.println(temp + " is a palindrom number");
		}
		else
		{
			System.out.println(temp + "is not a palindrom number");
		}

	}

}
