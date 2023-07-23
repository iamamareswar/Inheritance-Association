package com.gqt.entities;

public class Bike 
{
	private String brand;
	private int mileage;
	
	public Bike(String brand, int mileage) {
		super();
		this.brand = brand;
		this.mileage = mileage;
	}

	public String getBrand() {
		return brand;
	}

	public int getMileage() {
		return mileage;
	}
}
