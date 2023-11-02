package com.xworkz.temple.dto;

import java.io.Serializable;
import java.util.Objects;

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
public class TempleDTO implements Serializable{
	
	@Override
	public int hashCode() {
		return Objects.hash(const_by, god, name, place, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TempleDTO other = (TempleDTO) obj;
		return Objects.equals(const_by, other.const_by) && Objects.equals(god, other.god)
				&& Objects.equals(name, other.name) && Objects.equals(place, other.place) && year == other.year;
	}
	private String name;
	private String place;
	private String god;
	private int year;
	private String const_by;

}
