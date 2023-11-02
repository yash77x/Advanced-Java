package com.xworkz.collectiondto.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.collectiondto.ActorDTO;

public class ActorCollection {

	public static void main(String[] args) {
		ActorDTO dto = new ActorDTO(1, "Tom Cruise", "Male", "USA", "English");
		ActorDTO dto1 = new ActorDTO(2, "Varun Dhawan", "Male", "India", "Hindi");
		ActorDTO dto2 = new ActorDTO(3, "Robert Downey Jr", "Male", "USA", "English");
		ActorDTO dto3 = new ActorDTO(4, "Shraddha Kapoor", "Female", "India", "Marathi");
		ActorDTO dto4 = new ActorDTO(5, "Selena Gomez", "Female", "USA", "English");
		ActorDTO dto5 = new ActorDTO(6, "Tom Hiddleston", "Male", "England", "English");
		ActorDTO dto6 = new ActorDTO(7, "Kriti Sanon", "Female", "India", "Hindi");
		ActorDTO dto7 = new ActorDTO(8, "Elizabeth Olsen", "Female", "USA", "English");
		ActorDTO dto8 = new ActorDTO(9, "John Abhraham", "Male", "India", "Hindi");
		ActorDTO dto9 = new ActorDTO(10, "Prabhas", "Male", "India", "Telugu");

		Collection<ActorDTO> collection = new HashSet<ActorDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		
		collection.stream().sorted().forEach(v->System.out.println(v));
		
		System.out.println("actors in desc order by name");
		List<String> name = collection
				.stream()
				.sorted((n1,n2)->n2.getName().compareTo(n1.getName()))
				.map(na->na.getName())
				.collect(Collectors.toList());
		name.forEach(n->System.out.println(n));
		
		
		
	}

}
