package com.xworkz.collectiondto;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ActorDTO implements Comparable<ActorDTO>{
	
	private int id;
	private String name;
	private String gender;
	private String country;
	private String lang;

	@Override
	public int compareTo(ActorDTO o) {
		ActorDTO temp = this;
		return temp.getName().compareTo(o.getName());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ActorDTO other = (ActorDTO) obj;
		return Objects.equals(country, other.country) && Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, name);
	}

}
