package string;

public class StringConcat {
	

	public static void main(String []args) {
		
		
		
		int i=10;
		int j=20;
		
		System.out.println(i+j);//by using + operator and this operator will perform addition.
		
		
		String s1="Selenium";
		String s2="Express";
		
		
		System.out.println(s1+s2);//by using + operator we can achieve concatenation this operator will perform concatenation.
		
		System.out.println(s1+i+s2+j);//selenium10express20 //by using + operator we can achieve concatenation this operator will perform concatenation.
		System.out.println(i+j+s1+s2);//30seleniumexpress
		System.out.println(s1+i+j+s2);//selenium1020express
		System.out.println(i+s1+j+s2);//10selenium20express
		System.out.println(i+s1+s2+j);//10seleniumexpress20

		String s3=s1.concat(s2);//by using concat method we can achieve concatenation this operator will perform concatenation.
		System.out.println(s3);
		
		String str1="ABC";
		String str2=str1;
		System.out.println(str2);
		//Another way by taking a StringBuffer :
		
		StringBuffer sb=new StringBuffer(str1);
		System.out.println(sb);
		
	}

}
