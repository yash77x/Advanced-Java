package com.xworkz.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Mobile {

	public static void main(String[] args) {
		Collection<Long> collection = new HashSet<Long>();
		collection.add((long) 866789879);
		collection.add((long) 789876568);
		collection.add((long) 987654567);
		collection.add((long) 876534567);
		collection.add((long) 765345679);
		collection.add((long) 987653456);
		collection.add((long) 876543456);
		collection.add((long) 987653456);
		collection.add((long) 567876543);
		collection.add((long) 456789876);
		System.out.println("add");
		System.out.println(collection);
		
		
		Collection<Long> collection1 = new HashSet<Long>();
		collection1.addAll(collection);
		System.out.println("addAll");
		System.out.println(collection1);

		System.out.println("remove");
		collection1.remove((long) 876543456);
		System.out.println(collection1);
		
		System.out.println("removeAll");
		collection.removeAll(collection);
		System.out.println(collection);
		
		System.out.println("contains");
		boolean check = collection1.contains((long) 567876543);
		System.out.println(check);
		
		System.out.println("containsAll");
		boolean check1 = collection1.containsAll(collection);
		System.out.println(check1);
		
		System.out.println("size");
		System.out.println(collection1.size());
		
		System.out.println("isEmpty");
		System.out.println(collection1.isEmpty());
		
		
		System.out.println("toArray");
		Object[] c = collection1.toArray();
		for(int i=0 ;i<c.length;i++){  
			System.out.println("Mobile No.'s are  "+ c[i]);  
		}
		
		System.out.println("retain");
		collection.retainAll(collection1);
		System.out.println(collection);
		
		System.out.println("iterator");
        Iterator<Long> iterator = collection1.iterator();  
        while (iterator.hasNext()) {  
        	System.out.println(iterator.next());
        }
		
	}

}
