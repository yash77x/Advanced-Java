package com.xworkz.collectiondto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MovieDTO implements Serializable{

	private int id;
	private String name;
	private language lang;
	private String producer;
	private String director;
	private double budget;
}

