package com.xworkz.grocery.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class GroceryDTO implements Serializable{
	
	private String name;
	private String type;
	private int pricee;
	private int quantityy;

}
