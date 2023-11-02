package com.xworkz.temple;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.xworkz.temple.dto.TempleDTO;

public class CollectionTester {
	public static void main(String[] args) {
		TempleDTO dto = new TempleDTO("Hanuman Temple", "Dharwad", "Hanuman", 1997, "xwrokz");
		TempleDTO dto1 = new TempleDTO("Ganesh Temple", "Hubli", "Ganesh", 1999, "xwrokz");
		TempleDTO dto2 = new TempleDTO("Iskon Temple", "Bangalore", "Krishna", 1989, "xwrokz");
		TempleDTO dto3 = new TempleDTO("Ganesh Temple", "Hubli", "Ganesh", 2000, "xwrokz");
		
		Collection<TempleDTO> collection = new HashSet<TempleDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		
		System.out.println("Total Temples: "+collection.size());
		
		for (TempleDTO templeDTO : collection) {
			templeDTO.getName();
		}
		
		System.out.println("Iterator");
		Iterator<TempleDTO> iterator = collection.iterator();
		while (iterator.hasNext()) {
			TempleDTO ele = iterator.next();
			System.out.println(ele.getName());
			
			if(ele.getGod().equals("Ganesh")) {
				iterator.remove();
			}
			
		}
	}

}
