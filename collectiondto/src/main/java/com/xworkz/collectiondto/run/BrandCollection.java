package com.xworkz.collectiondto.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.collectiondto.BrandDTO;

public class BrandCollection {

	public static void main(String[] args) {

		BrandDTO dto = new BrandDTO("Apple", "Tim Cook", 200, "USA");
		BrandDTO dto1 = new BrandDTO("Puma", "Arne Freundt", 8.65, "Germany");
		BrandDTO dto2 = new BrandDTO("Google", "Sundar Pichai", 200, "USA");
		BrandDTO dto3 = new BrandDTO("Dell", "Michael S Dell", 10.1, "USA");
		BrandDTO dto4 = new BrandDTO("Sonata", "Samir Dhir", 5.53, "India");
		BrandDTO dto5 = new BrandDTO("Tesla", "Elon", 8.14, "USA");
		BrandDTO dto6 = new BrandDTO("Lenovo", "Yang Yuanqing", 61.3, "China");
		BrandDTO dto7 = new BrandDTO("TCS", "Ratan Tata", 27.1, "India");
		BrandDTO dto8 = new BrandDTO("Redmi", "Rajendra Saraf", 13.2, "China");
		BrandDTO dto9 = new BrandDTO("Infosys", "Sundar Pichai", 200, "India");

		Collection<BrandDTO> collection = new HashSet<BrandDTO>();
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

		collection.stream().sorted().forEach(v -> System.out.println(v));

		System.out.println("Revenue greater than 20");
		collection.stream().filter(v -> v.getRevenueInBillions() > 20).forEach(v -> System.out.println(v));

		System.out.println("Revenue Less than 20");
		collection.stream().filter(v -> v.getRevenueInBillions() < 20).forEach(v -> System.out.println(v));

		System.out.println("Brands from the USA:");
		List<BrandDTO> usa = collection.stream().filter(v -> v.getCountry().equals("USA")).collect(Collectors.toList());
		usa.forEach(v -> System.out.println(v));
		
		System.out.println("Brands not from the USA:");
		List<BrandDTO> notUsa = collection.stream().filter(v -> !v.getCountry().equals("USA")).collect(Collectors.toList());
		notUsa.forEach(v -> System.out.println(v));
		
		System.out.println("Brand name starts with I");
		List<BrandDTO> I = collection.stream().filter(v -> v.getName().startsWith("I")).collect(Collectors.toList());
		I.forEach(v -> System.out.println(v));

		System.out.println("Brand where owner name length is greater than 5");
		List<BrandDTO> name = collection.stream().filter(v -> v.getOwner().length()>5).collect(Collectors.toList());
		name.forEach(v -> System.out.println(v));
		
		System.out.println("Brand where owner name length is less than 5");
		List<BrandDTO> name1 = collection.stream().filter(v -> v.getOwner().length()<5).collect(Collectors.toList());
		name1.forEach(v -> System.out.println(v));

	}

}
