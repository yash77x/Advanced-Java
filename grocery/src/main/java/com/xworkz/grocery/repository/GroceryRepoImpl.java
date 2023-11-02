package com.xworkz.grocery.repository;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.grocery.dto.GroceryDTO;

public class GroceryRepoImpl implements GroceryRepository {
	private Collection<GroceryDTO> group = new LinkedList<GroceryDTO>();

	@Override
	public void save(GroceryDTO dto) {
		System.out.println("Invoking save in grocery Repository");
		boolean saved = group.add(dto);
		if(saved) {
			System.out.println("Data Saved Successfully "+dto);
		}
		else {
			System.err.println("Data not saved");
		}

	}
	
	@Override
	public int total() {
		return this.group.size();
	}
	
	@Override
	public Collection<GroceryDTO> getAll() {
		
		return this.group;
	}

}
