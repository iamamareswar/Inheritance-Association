package com.gqt.entities1;

public class Charger 
{
	private String brand;
	private float voltage;
	
	public Charger(String brand, float voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}

	public String getBrand() {
		return brand;
	}

	public float getVoltage() {
		return voltage;
	}
	
}
