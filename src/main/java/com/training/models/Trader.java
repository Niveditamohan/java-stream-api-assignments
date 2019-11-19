package com.training.models;

public class Trader {

	private String name; 
	private String city;
	
	/**
	 * Default constructor
	 */
	public Trader() {
	}

	/**
	 * Parameterized constructor
	 * @param name
	 * @param city
	 */
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	/**
	 * Getters and setters for alll attributes of fruit object
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Overridden toString() method
	 */
	@Override
	public String toString() {
		return "Trader Name: " + name + ", City: " + city;
	}
	
}
