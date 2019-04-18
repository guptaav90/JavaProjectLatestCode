package constructor;

public class Constructor {
	
	//1
	String empName;
	int empId;
	
	//2,3
	String empName1="Test";
	int empId1=101;
	
	public Constructor(String empName1,int empId1) {
		
		this.empId1=empId1;
		this.empName1=empName1;
	}
	

	

	public Constructor() {
		// TODO Auto-generated constructor stub
	}




	public static void main(String[] args) {
		
		//1
		Constructor c=new Constructor();
		System.out.println(c.empId + " " +c.empName);

		Constructor c1=new Constructor();
		System.out.println(c1.empId+" "+c1.empName);
	/*	here for obj1 empId and empName initialize value is 0 and null and as well as obj 2 but we need a unique value 
		for both object
		
		*/
		
		//2
		Constructor c2=new Constructor();
		System.out.println(c2.empId1 + " " +c2.empName1);

		Constructor c3=new Constructor();
		System.out.println(c3.empId1+" "+c3.empName1);
		/*here also for obj1 empId and empName initialize value is 101 and Test and as well as obj 2 but we need a unique value 
		for both object
		*/
		
		//3
		Constructor c4=new Constructor();
	    c4.empId=101;
	    c4.empName="Selenium";
	    System.out.println(c4.empId+" "+c4.empName);

		Constructor c5=new Constructor();
		c5.empId=102;
		c5.empName="Automation";
		System.out.println(c5.empId+" "+c5.empName);
		/*here for obj1 empId and empName initialize value is 101 and Selenium and as well as obj 2 102 and 
		 Automation means here we are getting unique value because we are initializing the variables of object but to get the unique value we need to create multiple object 
		 and initialize the object of variables at every time as well as.
		*/
		
		
		Constructor c6=new Constructor("Tom", 201);
		System.out.println("Employee 1st : "+ c6.empId1+" "+c6.empName1);
		Constructor c7=new Constructor("Peter", 202);
		System.out.println("Employee 2nd : "+c7.empId1+" "+c7.empName1);
		/*
		 here we initializing the objects to get the unique values.
		*/
	}
	
	}


