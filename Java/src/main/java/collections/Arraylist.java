package collections;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {


		
		ArrayList al=new ArrayList();
		al.add("Java");
		al.add(12.899);
		al.add("QA"); 
		al.add('C');
		al.add("Maven");
		al.add(8600);
		al.add("GIT");
		al.add("Jenkins");
		al.add("");
		al.add("Java");
		al.add(null);
		
		
		System.out.println(al);//you can the print the element of array list object directly with help of the class of object.
		System.out.println("**********");
		System.out.println(al.size());//size method returns length of array list means total no of element.
		System.out.println("**********");
		System.out.println(al.get(4));//get(index) returns fetch the particular element from array list
		
		System.out.println("**********");
		
		ArrayList al1=new ArrayList();
		al1.add("TEST");
		al1.add("RUN");
	
		System.out.println(al1.isEmpty());//IsEmpty method returns boolean if array list has no element then return true either false

		System.out.println("**********");
		
		ArrayList al2=new ArrayList();
		al2.add("QA");
		al2.add("DEV");
		al2.add("STAGING");
		al2.add("PRODUCTION");
		System.out.println(al2.contains("QA"));//contains method checks is given element is present in array list object
		System.out.println("**********");
		System.out.println(al2.containsAll(al));//containsAll method checks in given array list object of ALL the element is present in second array list object
		
		System.out.println("**********");
		
		System.out.println(al2.remove("QA"));//remove method remove the given element from array list object
		System.out.println("**********");
		System.out.println(al2);
		
		System.out.println("**********");
		
		al2.addAll(al1);//addAll method add the second array list object of element into first array list of object
		
		for (Object obj : al2) {
			
			System.out.println(obj);
			
		}
		
		System.out.println("**********");
		
		al2.removeAll(al1);//removeAll method remove the second array list object of element from first array list of object
		
		for (Object obj1 : al2) {
			
			System.out.println(obj1);
		}
		
		System.out.println("**********");
		
		ArrayList al3=new ArrayList();
		al3.add("QA");
		al3.add("TEST");
		
		ArrayList al4=new ArrayList();
		al4.add("QA");
		al4.add("LOCAL");
		
		al3.retainAll(al4);//retains method checks in two array list object if in both object element is samae then return that element
		System.out.println(al3);
		
		System.out.println("**********");
		
		al4.set(0, "SERVER");//set method remove that index of element from array list object which is given in set method
		
		for (Object obj2 : al4) {
			
			System.out.println(obj2);
		}
		
		
		
		
		
		
	}

}
