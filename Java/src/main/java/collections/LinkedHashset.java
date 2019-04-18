package collections;

import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {


		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Java");
		lhs.add(null);
		lhs.add(9);
		lhs.add("Selenium");
		lhs.add("Jenkins");
		lhs.add("Selenium");
		lhs.add("Java");
		lhs.add(null);
		
		
		
		
		for (Object obj : lhs) {
			
			System.out.println(obj);
		}
	
		//hs.get();
		
	}

}
