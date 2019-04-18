package array;

public class SingleDimensionalArray {
	
	
	public static void main(String[] args) {

		int[]i=new int[5];
		/*declaration int[]a,creation new int[3], here we can give array of size at the time of creation 
		 * not at the time of declaration*/	
		
		 i[0]=10;//Initialization
		 i[1]=20;
		 i[3]=30;
		 
		
		System.out.println(i[4]);//you can access randomly by using index.
		System.out.println(i.length);//we can print the size of array.
		 
		 for (int a : i) {
   /*int i we need to create same datatype of variable which is declared at the time of array declaration 
    * then : a here we have to store in array or in collection.
	*/		
			 System.out.println(a);
		}
		
	}

}
