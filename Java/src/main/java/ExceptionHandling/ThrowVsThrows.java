package ExceptionHandling;

public class ThrowVsThrows {

	public static void main(String[] args) {


		try {
			throw new Exception("ABC Exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		//throw new Exception("ABC Exception");

}

}