package com.xworkz.collections;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VegetableDTO implements Serializable{
	
	private int id;
	private String name;
	private int price;
	private int weight;

}
