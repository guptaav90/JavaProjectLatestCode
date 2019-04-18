package collections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {


		LinkedList ll=new LinkedList();
		ll.add("Java");
		ll.add("Selenium");
		ll.add("Maven");
		ll.add("Jenkins");
		ll.add("");
		ll.add("Selenium");
		ll.add(null);
		
		System.out.println(ll.get(3));
		
		System.out.println("***********");
		
		System.out.println(ll.size());
		
		System.out.println("***********");
		
		for (Object obj : ll) {
			
			System.out.println(obj);
		}
		
		System.out.println("***********");
		
		LinkedList ll1=new LinkedList();
		ll1.add("Test");
		ll1.add("QA");
		
		ll1.addAll(ll);
		
		for (Object obj1 : ll1) {
			
			System.out.println(obj1);
		}
		
		System.out.println("***********");
		
		
		ll1.removeAll(ll);
		
		for (Object obj2 : ll1) {
			
			System.out.println(obj2);
		}
		
		System.out.println("***********");
		
		
		LinkedList ll2=new LinkedList();
		ll2.add("DEV");
		ll2.add("LOCAL");
		
		ll2.remove("LOCAL");
		
		for (Object obj3 : ll2) {
			
			System.out.println(obj3);
		}
		
		System.out.println("***********");

		LinkedList ll3=new LinkedList();
		ll3.add("TRIAL");
		ll3.add("PRODUCTION");
		
		
		System.out.println(ll3.contains("PROD"));
		
		System.out.println("***********");
		
		LinkedList ll4=new LinkedList();
		ll4.add("STAGING");
		ll4.add("PRODUCTION");
		ll4.add("TRIAL");
		
		
		
	    System.out.println(ll3.containsAll(ll4));
	    
		System.out.println("***********");
		
		System.out.println(ll4.size());
		
		System.out.println("***********");
		
		System.out.println(ll4.isEmpty());
		
		System.out.println("***********");
		
		
		ll4.retainAll(ll3);
		
		for (Object obj4 : ll4) {
			
			System.out.println(obj4);
		}
		
		System.out.println("***********");
		
		LinkedList ll5=new LinkedList();
		ll5.add("INDIA");
		ll5.add("RUSSIA");
		ll5.add("USA");
		
		
		ll5.set(2, "DUBAI");
		
		for (Object obj5 : ll5) {
			
			System.out.println(obj5);
		}
		
		System.out.println("***********");
		
		ll5.addFirst("NEPAL");
		
		for (Object obj6 : ll5) {
			
			System.out.println(obj6);
		}
		
		System.out.println("***********");
		
		ll5.addLast("BHUTAN");
		
		for (Object obj7 : ll5) {
			
			System.out.println(obj7);
		}
		
		System.out.println("***********");
		
		ll5.removeFirst();
		
		for (Object obj7 : ll5) {
			
			System.out.println(obj7);
			
		}
		
		System.out.println("***********");
		
		ll5.removeLast();
		
		for (Object obj8 : ll5) {
			
			System.out.println(obj8);
		}
	}

}
