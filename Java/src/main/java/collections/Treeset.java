package collections;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {


		TreeSet ts=new TreeSet();
		ts.add("APPLE");
		ts.add("SAMSUNG");
		ts.add("NOKIA");
		//ts.add(9);
		ts.add("APPLE");
		ts.add("NOKIA");
		//ts.add(null);
		//ts.add('c');
		
		for (Object obj : ts) {
			
			System.out.println(obj);
		}
		
		//hs.get();
		
	
		ArrayList  obj1=new ArrayList(ts); // creation of list object
		System.out.println(obj1.get(2));

		
	}

}
