package com.xworkz.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class VegetableCollection {

	public static void main(String[] args) {
		VegetableDTO dto = new VegetableDTO(1, "Tomato", 20, 1);
		VegetableDTO dto1 = new VegetableDTO(2, "Onion", 120, 2);
		VegetableDTO dto2 = new VegetableDTO(3, "Carrot", 160, 3);
		VegetableDTO dto3 = new VegetableDTO(4, "Garlic", 10, 1);
		VegetableDTO dto4 = new VegetableDTO(5, "Potato", 40, 2);
		VegetableDTO dto5 = new VegetableDTO(6, "Brocolli", 25, 1);
		VegetableDTO dto6 = new VegetableDTO(7, "Cabbage", 110, 3);
		VegetableDTO dto7 = new VegetableDTO(8, "Peas", 70, 1);
		VegetableDTO dto8 = new VegetableDTO(9, "Spinach", 40, 1);
		VegetableDTO dto9 = new VegetableDTO(9, "Spinach", 40, 1);

		Collection<VegetableDTO> collection = new HashSet<VegetableDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);

		
		Collection<VegetableDTO> collection1 = new HashSet<VegetableDTO>();
		
		collection.forEach((v)->{
			if(v.getPrice()>= 100) {
				System.out.println(v.getName()+ " is greater than 100");
			}
			else {
				System.out.println(v.getName()+ " is less than 100");
				collection1.add(v);
			}
		});
      Iterator<VegetableDTO> iterator = collection1.iterator();  
      while (iterator.hasNext()) {  
      	System.out.println(iterator.next());
      }
		
//		collection1.addAll(collection);
//		System.out.println("addAll");
//		System.out.println(collection1);
//		
//		System.out.println("remove");
//		collection1.remove(dto1);
//		System.out.println(collection1);
//		
//		System.out.println("removeAll");
//		collection.removeAll(collection);
//		System.out.println(collection);
//		
//		System.out.println("contains");
//		boolean check = collection1.contains(dto3);
//		System.out.println(check);
//		
//		System.out.println("containsAll");
//		boolean check1 = collection1.containsAll(collection);
//		System.out.println(check1);
//		
//		System.out.println("size");
//		System.out.println(collection1.size());
//		
//		System.out.println("isEmpty");
//		System.out.println(collection1.isEmpty());
//		
//		
//		System.out.println("toArray");
//		Object[] c = collection1.toArray();
//		for(int i=0 ;i<c.length;i++){  
//			System.out.println("Vegetables are  "+ c[i]);  
//		}
//		
//		System.out.println("retain");
//		collection.retainAll(collection1);
//		System.out.println(collection);
//		
//		System.out.println("iterator");
//        Iterator<VegetableDTO> iterator = collection1.iterator();  
//        while (iterator.hasNext()) {  
//        	System.out.println(iterator.next());
//        }
	}

}
