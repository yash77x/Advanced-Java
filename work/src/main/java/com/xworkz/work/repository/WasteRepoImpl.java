package com.xworkz.work.repository;

import com.xworkz.work.dto.WasteDTO;

public class WasteRepoImpl implements WasteRepository {
	
	private WasteDTO dtos[] = new WasteDTO[TOTAL];
	int index = 0;

	@Override
	public void save(WasteDTO dto) {
		if (index < TOTAL) {
			this.dtos[index] = dto;
			System.out.println("saved at " + index);
			index++;
		} 
		else {
			System.out.println("Storage is full");
		}
	}

}
