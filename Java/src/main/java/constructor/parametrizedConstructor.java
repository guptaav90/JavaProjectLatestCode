package constructor;

public class parametrizedConstructor {

	
public parametrizedConstructor(String empName,int empId) {
		
	System.out.println("parametrizedConstructor");
	}

	public static void main(String[] args) {

		parametrizedConstructor c6=new parametrizedConstructor("Tom", 201);
		parametrizedConstructor c7=new parametrizedConstructor("Peter", 202);

		
	}

}
