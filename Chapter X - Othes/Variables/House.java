package com.a;

import java.util.ArrayList;

public class House {
	// static final constants should be all caps with words separated by underscore
	public static final int NUMBER_OF_BEDROOMS = 4;
	public static final int NUMBER_OF_BATHROOMS = 2;
	
	// instance variables declared protected
	// each variable on their own line
	protected int floors;
	protected ArrayList<String> namesOfResidents;
	
	public House(int floors) {
		this.floors = floors;
	}

	public String getNamesOfResidents() {
		StringBuilder sBuilder = new StringBuilder();
		
		// using i as temporary variable
		for (int i = 0; i < namesOfResidents.size(); i++) {
			sBuilder.append(namesOfResidents.get(i) + " ");
		}
		
		return sBuilder.toString();
	}
}


