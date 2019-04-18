package collections;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTable {

	public static void main(String[] args) {


		Hashtable hm=new Hashtable();
		hm.put(1, "Tom");
		hm.put(2, "Peter");
		hm.put(3, "Jordan");
		hm.put(4, "Kristin");
		hm.put(5, "Dean");
		hm.put(5, "Mayank");
		System.out.println(hm);
		
		
		Hashtable<Integer,String> hmap=new Hashtable<Integer,String> ();
		hmap.put(1, "Rajiv");
		hmap.put(2, "Devi");
		hmap.put(3, "Gaurav");
		hmap.put(4, "Manoj");
		hmap.put(5, "Mayank");
		
		for (Entry<Integer, String> entry : hmap.entrySet()) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("***********");
		
		hmap.remove(1);
		
		for (Entry<Integer, String> entry1 : hmap.entrySet()) {
			
			System.out.println(entry1.getKey()+" "+entry1.getValue());
		}
		
		System.out.println("***********");
		
		System.out.println(hmap.get(4));
		
		System.out.println("***********");
		
		System.out.println(hmap.containsKey(9));
		
		System.out.println("***********");
		
		System.out.println(hmap.containsValue("Gaurav"));
		
		System.out.println("***********");
		
		hmap.size();
		System.out.println(hmap);
		
		System.out.println("***********");
		
		
		hmap.replace(2, "Amit");
		
		for (Entry<Integer, String> entry2 : hmap.entrySet()) {
			
			System.out.println(entry2.getKey()+" "+entry2.getValue());
		}
		
		System.out.println("***********");
		
		hmap.clear();
		System.out.println(hmap);
		
	
		
	
		
	}

}
