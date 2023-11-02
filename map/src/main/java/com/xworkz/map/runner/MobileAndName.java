package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MobileAndName {

	public static void main(String[] args) {
		Map<Long, String> map=new HashMap<Long, String>();
		map.put(9876534568L, "Yash");
		map.put(7654345678L, "Abdul");
		map.put(7653456789L, "varun");
		map.put(8765456789L, "Ranjith Kumar");
		map.put(8765434567L, "Mohammad Ismail");
		map.put(8987654378L, "Manoj");
		map.put(8764567878L, "Suraj");
		map.put(9876523457L, "Hariharan");
		map.put(7809876544L, "Omkareshwar");
		map.put(9876543456L, "Abhishek");

		System.out.println("Name greater than 10 characters");
		map.values()
		.stream()
		.filter(g->g.length()>10)
		.forEach(System.out::println);
			
		
		System.out.println("Name less than 10 characters");
		map.values()
		.stream()
		.filter(l->l.length()<10)
		.forEach(System.out::println);
	
		
		System.out.println("Names in UpperCase");
		map.values()
		.stream()
		.forEach(u->System.out.println(u.toUpperCase()));
		
		
		System.out.println("Mobile Numbers ending with 0");
		map.keySet()
		.stream()
		.filter(z->z.toString().endsWith("0") )
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("Mobile Numbers Starting with 8");
		map.keySet()
		.stream()
		.filter(z->z.toString().startsWith("8") )
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}

}
