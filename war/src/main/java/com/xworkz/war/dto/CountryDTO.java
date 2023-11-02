package com.xworkz.war.dto;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CountryDTO implements Serializable {
	private int id;
	private String name;
	private PresidentDTO presidentDTO;
	private String continent;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryDTO other = (CountryDTO) obj;
		return Objects.equals(continent, other.continent) && Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(continent, name);
	}

}
