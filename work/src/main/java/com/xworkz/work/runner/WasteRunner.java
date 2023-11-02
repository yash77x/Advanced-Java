package com.xworkz.work.runner;

import com.xworkz.work.dto.WasteDTO;
import com.xworkz.work.service.WasteService;
import com.xworkz.work.service.WasteServiceImpl;

public class WasteRunner {

	public static void main(String[] args) {
		WasteDTO dto = new WasteDTO("electric","electronic-waste", 20.6);
		
		WasteService service = new WasteServiceImpl();
		
		boolean ser = service.validateAndSave(dto);
		if(ser) {
			System.out.println("Saved "+ ser);
		}
		else {
			System.err.println("Saved "+ ser);
		}
	}

}
