package com.xworkz.war.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WarDTO implements Serializable{

	private int id;
	private LocalDate startDate;
	private LocalDate endDate;
	private Collection<CountryDTO> countries;
	private String wonBy;
}
