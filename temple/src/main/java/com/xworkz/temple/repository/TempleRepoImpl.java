package com.xworkz.temple.repository;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.temple.dto.TempleDTO;

public class TempleRepoImpl implements TempleRepository {
	private Collection<TempleDTO> group = new HashSet<TempleDTO>();

	@Override
	public void save(TempleDTO dto) {
		System.out.println("Invoking save in temple Repository");
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
	public Collection<TempleDTO> getAll() {
		return this.group;
	}

}
