package com.xworkz.collectiondto.run;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.collectiondto.PlayerDTO;
import com.xworkz.collectiondto.Sport;

public class PlayerCollection {

	public static void main(String[] args) {

		PlayerDTO dto = new PlayerDTO(1, "Rohit", "India", Sport.CRICKET, 36);
		PlayerDTO dto1 = new PlayerDTO(2, "Virat", "India", Sport.CRICKET, 35);
		PlayerDTO dto2 = new PlayerDTO(3, "Sunil Chettri", "India", Sport.FOOTBALL, 37);
		PlayerDTO dto3 = new PlayerDTO(4, "Ronaldo", "Portugal", Sport.FOOTBALL, 39);
		PlayerDTO dto4 = new PlayerDTO(5, "Messi", "Argentina", Sport.FOOTBALL, 36);
		PlayerDTO dto5 = new PlayerDTO(6, "Babar", "Pakistan", Sport.CRICKET, 29);
		PlayerDTO dto6 = new PlayerDTO(7, "Maxwell", "Australia", Sport.CRICKET, 34);
		PlayerDTO dto7 = new PlayerDTO(8, "P V Sindhu", "India", Sport.TENNIS, 29);
		PlayerDTO dto8 = new PlayerDTO(9, "Kane", "New Zealand", Sport.CRICKET, 32);
		PlayerDTO dto9 = new PlayerDTO(10, "Harmanpreet Singh", "India", Sport.HOCKEY, 26);
		PlayerDTO dto10 = new PlayerDTO(11, "Smriti mandhana", "India", Sport.CRICKET, 30);
		PlayerDTO dto11 = new PlayerDTO(12, "Hardik Singh", "India", Sport.HOCKEY, 24);
		PlayerDTO dto12 = new PlayerDTO(13, "Rafael Nadal", "Spain", Sport.TENNIS, 33);
		PlayerDTO dto13 = new PlayerDTO(14, "Andrey Rublev", "Russia", Sport.TENNIS, 30);
		PlayerDTO dto14 = new PlayerDTO(15, "Dhoni", "India", Sport.CRICKET, 40);
		PlayerDTO dto15 = new PlayerDTO(16, "Jos Butler", "England", Sport.CRICKET, 33);

		Collection<PlayerDTO> collection = new HashSet<PlayerDTO>();
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
		collection.add(dto10);
		collection.add(dto11);
		collection.add(dto12);
		collection.add(dto13);
		collection.add(dto14);
		collection.add(dto15);
		for (PlayerDTO playerDTO : collection) {
			System.out.println(playerDTO);
		}

		
		Collection<PlayerDTO> country = new HashSet<PlayerDTO>();
		collection.forEach((v)->{
			if(v.getCountry().equals("India")) {
				country.add(v);
			}
			else {
				System.out.println(v.getName()+" is not from India");
			}
		});
		for (PlayerDTO playerDTO : country) {
			System.out.println(playerDTO);
		}
		
		Collection<PlayerDTO> sport = new HashSet<PlayerDTO>();
		collection.forEach((v)->{
			if(v.getSport().equals(Sport.CRICKET)) {
				sport.add(v);
			}
			else {
				System.out.println(v.getName()+" does not play cricket");
			}
		});
		for (PlayerDTO playerDTO : sport) {
			System.out.println(playerDTO);
		}
		
		
		Collection<PlayerDTO> age = new HashSet<PlayerDTO>();
		collection.forEach((v)->{
			if(v.getAge()>20 && v.getAge()<30) {
				age.add(v);
			}
			else {
				System.out.println(v.getName()+" is above 30");
			}
		});
		for (PlayerDTO playerDTO : age) {
			System.out.println(playerDTO);
		}
		
		Collection<PlayerDTO> age1 = new HashSet<PlayerDTO>();
		collection.forEach((v)->{
			if(v.getAge()>30) {
				age1.add(v);
			}
			else {
				System.out.println(v.getName()+" is below 30");
			}
		});
		for (PlayerDTO playerDTO : age1) {
			System.out.println(playerDTO);
		}
		
		Collection<PlayerDTO> age2 = new HashSet<PlayerDTO>();
		collection.forEach((v)->{
			if(v.getAge()>40) {
				age2.remove(v);
			}
			else {
				System.out.println(v.getName()+" is not above 40");
			}
		});
		for (PlayerDTO playerDTO : age2) {
			System.out.println(playerDTO);
		}

	}

}
