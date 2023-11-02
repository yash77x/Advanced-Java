package com.xworkz.collectiondto;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BrandDTO  implements Comparable<BrandDTO>{

	private String name;
	private String owner;
	private double revenueInBillions;
	private String country;

	@Override
	public int compareTo(BrandDTO args) {

		BrandDTO temp = this;
		return temp.getName().compareTo(args.getName());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, owner);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BrandDTO other = (BrandDTO) obj;
		return Objects.equals(name, other.name) && Objects.equals(owner, other.owner);
	}

}
