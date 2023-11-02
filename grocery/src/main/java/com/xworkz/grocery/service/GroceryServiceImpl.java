package com.xworkz.grocery.service;

import java.util.Collection;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.repository.GroceryRepository;

public class GroceryServiceImpl implements GroceryService{
	
	private GroceryRepository repository;

	public GroceryServiceImpl(GroceryRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(GroceryDTO dto) {
		System.out.println("Invoking validate and save in grocery service"+dto);
		this.repository.save(dto);
		return true;
	}
	
	@Override
	public int total() {
		
		return this.repository.total();
	}
	
	@Override
	public Collection<GroceryDTO> getAll() {
		
		return this.repository.getAll();
	}

}
