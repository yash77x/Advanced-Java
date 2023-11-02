package com.xworkz.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Email {

	public static void main(String[] args) {
		Collection<String> collection = new HashSet<String>();
		collection.add("yash@gmail.com");
		collection.add("ismail@gmail.com");
		collection.add("manoj@gmail.com");
		collection.add("ranjith@gmail.com");
		collection.add("varun@gmail.com");
		collection.add("sarvesh@gmail.com");
		collection.add("anjali@gmail.com");
		collection.add("abhishek@gmail.com");
		collection.add("omkar@gmail.com");
		System.out.println("add");
		System.out.println(collection);
		
		
		Collection<String> collection1 = new HashSet<String>();
		collection1.addAll(collection);
		System.out.println("addAll");
		System.out.println(collection1);
		
		System.out.println("remove");
		collection1.remove("anjali@gmail.com");
		System.out.println(collection1);
		
		System.out.println("removeAll");
		collection.removeAll(collection);
		System.out.println(collection);
		
		System.out.println("contains");
		boolean check = collection1.contains("manoj@gmail.com");
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
			System.out.println("Emails are  "+ c[i]);  
		}
		
		System.out.println("retain");
		collection.retainAll(collection1);
		System.out.println(collection);
		
		System.out.println("iterator");
        Iterator<String> iterator = collection1.iterator();  
        while (iterator.hasNext()) {  
        	System.out.println(iterator.next());
        }
	}
}
