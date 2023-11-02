package com.xworkz.temple.service;

import java.util.Collection;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repository.TempleRepository;

public class TempleServiceImpl implements TempleService {
	
	private TempleRepository repository;
	
	public TempleServiceImpl(TempleRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(TempleDTO dto) {
		System.out.println("Invoking validate and save in Temple service"+dto);
		this.repository.save(dto);
		return true;
	}
	
	@Override
	public int total() {
		return this.repository.total();
	}
	
	@Override
	public Collection<TempleDTO> getAll() {
		return this.repository.getAll();
	}

}
