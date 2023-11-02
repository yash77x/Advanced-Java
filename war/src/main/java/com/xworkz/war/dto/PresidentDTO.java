package com.xworkz.war.dto;

import java.time.LocalDate;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PresidentDTO implements Comparable<PresidentDTO>{
	
	private int id;
	private String name;
	private int age;
	private LocalDate durationStart;
	private LocalDate durationEnd;

	@Override
	public int compareTo(PresidentDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PresidentDTO other = (PresidentDTO) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	
}
