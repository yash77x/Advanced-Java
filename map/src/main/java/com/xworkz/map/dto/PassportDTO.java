package com.xworkz.map.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PassportDTO implements Serializable{

	private int id;
	private long no;
	private LocalDate issuedDate;
	private String issuedBy;
	private LocalDate expiryDate;
	private Type passport;
}
