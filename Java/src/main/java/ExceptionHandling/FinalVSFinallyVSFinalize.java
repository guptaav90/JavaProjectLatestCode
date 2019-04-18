package ExceptionHandling;

public class FinalVSFinallyVSFinalize {
	
	final  static  int x=100;

	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("$$$");
	}
	
	public static void main(String[] args) throws Throwable {

          FinalVSFinallyVSFinalize f=new FinalVSFinallyVSFinalize();
          f.finalize();
		  
		//x=200;//Compile Time Error  //final
		
		try{  
			int x=9/0;  
			}
		
		 
			finally{ //finally
				System.out.println("finally block always executed");
				  
			}

	           
		System.out.println("***");
		
	
	}

}