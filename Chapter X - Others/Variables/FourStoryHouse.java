package com.a;

public class FourStoryHouse extends House{

	public FourStoryHouse(int floors) {
		super(floors);
	}
	
	public int getNumberOfFloors() {
		// access to floors variable from parent class
		return floors;
	}
}
