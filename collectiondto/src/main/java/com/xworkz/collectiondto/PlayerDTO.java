package com.xworkz.collectiondto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlayerDTO implements Serializable{
	private int id;
	private String name;
	private String country;
	private Sport sport;
	private int age;
}

