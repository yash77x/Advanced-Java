package com.xworkz.temple.function;

public class Run {

	public static void main(String[] args) {
		
		NewsPaper paper = (agency)->{
			if(agency.equals("TOI")) {
				return 8;
			}
			if(agency.equals("DH")) {
				return 5;
			}
			if(agency.equals("HT")) {
				return 4;
			}
			return 0;
			
		};
		
		call(paper, "TOI");
		
		Iphone iphone = ()->{
			return true;
		};
		
		phone(iphone);
		
		Tyre tyre = (brand,sizee,type)->{
			if(brand.equals("MRF")&& sizee==17 && type.equals("TWO")) {
				return 1300;
			}
			if(brand.equals("Apollo")&& sizee==17 && type.equals("TWO")) {
				return 1700;
			}
			if(brand.equals("MRF")&& sizee==11 && type.equals("TWO")) {
				return 900;
			}
			return 0;
		};
		
		check(tyre, "MRF", 11, "TWO");

}
	static void call(NewsPaper paper1,String agency){
		double val = paper1.priceByAgency(agency);
		System.out.println("Price is "+val);
		
	}
	
	static void phone(Iphone iphone) {
		boolean pho = iphone.looksGood();
		System.out.println(pho);
	}
	
	static void check(Tyre tyre,String brand, int sizee, String type) {
		double price = tyre.getPrice(brand, sizee, type);
		System.out.println("Price is: "+price);
	}
}
