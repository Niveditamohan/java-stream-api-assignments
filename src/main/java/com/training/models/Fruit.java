package com.training.models;

public class Fruit {

	private String name;
	private int calories;
	private int price;
	private String color;

	/**
	 * Default constructor
	 */
	public Fruit() {
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param name
	 * @param calories
	 * @param price
	 * @param color
	 */
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
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

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Overridden toString() method
	 */
	@Override
	public String toString() {
		return "Fruit: " + name + ", Calories: " + calories + ", Price: " + price + ", Color: " + color;
	}

}
