package com.ssangu.beerApp.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	
	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<>();
		
		if(color.equalsIgnoreCase("amber" )) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		} else {
			brands.add("Jail Pale Ale");
			brands.add("Gout Scout");
		}
		return brands;
	}
}
