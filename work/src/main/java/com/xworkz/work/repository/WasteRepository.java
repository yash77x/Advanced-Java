package com.xworkz.work.repository;

import com.xworkz.work.dto.WasteDTO;

public interface WasteRepository {
	
	int TOTAL = 5;
	
	public void save(WasteDTO dto);

}
