package Programs;

public class StarPattern {

	public static void main(String[] args) {
		
		/*
		 
		 *
		 **
		 ***
		 ****
		 
		 
		 
		 

*/
		for(int i=1;i<=4;i++) {         //i=4
			                            //j=4
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		/*
		
		****
		***
		**
		*
		

*/
		
		
		for(int i=1;i<=4;i++) {           //i=5
			                              //j=3
			
			for(int j=4;j>=i;j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		/*
		
		
		*
		**
		***
		****
		***
		**
		*
		
		
		
		*/
		
		for(int i=1;i<=4;i++) {               //i=5
			                                  //j=5
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	
		
		for(int i=1;i<=4;i++) {                 //i=5
                                                //j=3
			                                     
			for(int j=3;j>=i;j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
