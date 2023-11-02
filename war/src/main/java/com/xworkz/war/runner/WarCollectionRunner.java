package com.xworkz.war.runner;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.war.dto.CountryDTO;
import com.xworkz.war.dto.PresidentDTO;
import com.xworkz.war.dto.WarDTO;

public class WarCollectionRunner {

	public static void main(String[] args) {
		PresidentDTO presidentDTO = new PresidentDTO(1, "Zelensky", 47, LocalDate.of(2019, 10, 10), LocalDate.of(2023, 12, 30));
		PresidentDTO presidentDTO1 = new PresidentDTO(2, "Putin", 67, LocalDate.of(2013, 1, 20), LocalDate.of(2028, 11, 10));
		
		Collection<PresidentDTO> presidentDTOs = new HashSet<PresidentDTO>();
		presidentDTOs.add(presidentDTO);
		presidentDTOs.add(presidentDTO1);
		
		CountryDTO countryDTO = new CountryDTO(1, "Ukraine", presidentDTO, "Europe");
		CountryDTO countryDTO1 = new CountryDTO(2, "Russia", presidentDTO1, "Europe");
		
		Collection<CountryDTO> countryDTOs = new HashSet<CountryDTO>();
		countryDTOs.add(countryDTO);
		countryDTOs.add(countryDTO1);
		
		WarDTO warDTO = new WarDTO(1, LocalDate.of(2022, 2, 12), LocalDate.of(2023, 12, 10), countryDTOs, "Russia");
		
		Collection<WarDTO> warDTOs = new HashSet<WarDTO>();
		warDTOs.add(warDTO);
		
		List<PresidentDTO> war = warDTOs
				.stream()
				.flatMap(c->c.getCountries().stream())
				.map(p->p.getPresidentDTO())
				.collect(Collectors.toList());
		war.forEach(v->System.out.println(v));
		
		List<CountryDTO> war1 = warDTOs
				.stream()
				.flatMap(c->c.getCountries().stream())
				.collect(Collectors.toList());
		war1.forEach(v->System.out.println(v));
		
		List<String> war2 = warDTOs
				.stream()
				.flatMap(c->c.getCountries().stream())
				.map(c->c.getContinent())
				.collect(Collectors.toList());
		war2.forEach(v->System.out.println(v));
		
		List<WarDTO> war3 = warDTOs
				.stream()
				.filter(g->g.getStartDate().equals(LocalDate.of(2022, 2, 12))&& g.getEndDate().equals(LocalDate.of(2023, 12, 10)))
				.collect(Collectors.toList());
		war3.forEach(v->System.out.println(v));
	}
	
}
