package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {


		HashSet hs=new HashSet();
		hs.add("Java");
		hs.add(null);
		hs.add(9);
		hs.add("Selenium");
		hs.add("Jenkins");
		hs.add("Selenium");
		hs.add("Java");
		hs.add(null);
		hs.add('c');
		hs.add(null);
		
		
		for (Object obj : hs) {
			
			System.out.println(obj);
		}
		
		//hs.get();
		
		System.out.println("********************");
		
		ArrayList al=new ArrayList(hs);
		System.out.println(al.get(4));
		
		
	}

}
