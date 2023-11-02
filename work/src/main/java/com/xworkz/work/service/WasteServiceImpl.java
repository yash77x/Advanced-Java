package com.xworkz.work.service;

import com.xworkz.work.dto.WasteDTO;
import com.xworkz.work.repository.WasteRepoImpl;
import com.xworkz.work.repository.WasteRepository;
import com.xworkz.work.validate.Validation;

public class WasteServiceImpl implements WasteService {
	WasteRepository repository = new WasteRepoImpl();
	
	@Override
	public boolean validateAndSave(WasteDTO dto) {
		if (dto != null) {
			String name = dto.getName();
			String type = dto.getType();
			double weight = dto.getWeight();
			
			if (Validation.stringValidate(name)) {
				System.out.println("Name " + name);
			} else {
				System.err.println("Name " + name + " is not valid");
				return false;
			}
			
			if (Validation.stringValidate(type)) {
				System.out.println("Type " + type);
			} else {
				System.err.println("Type " + type + " is not valid");
				return false;
			}
			
			if(weight > 10 && weight < 100) {
				System.out.println("Weight " + weight);
			} else {
				System.err.println("Weight " + weight + " is not valid");
				return false;
			}
			
			repository.save(dto);
			return true;
		}
		else {
			System.err.println("null");
		}
		return false;
	}

}
