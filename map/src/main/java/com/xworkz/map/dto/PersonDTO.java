package com.xworkz.map.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonDTO implements Serializable{
	
	private int id;
	private String name;
	private String email;
	private long mobile;

}
