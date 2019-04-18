package constructor;

public class DefaultConstructor {
	
	int EmpID;
	String EmpName;
	
	public static void main(String args[])
	{
		DefaultConstructor dc=new DefaultConstructor();
		System.out.println(dc.EmpID);//0
		System.out.println(dc.EmpName);//null
	}

}
