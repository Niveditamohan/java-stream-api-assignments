package com.training.models;

public class Transaction {

	private Trader trader;
	private int year;
	private int value;

	/**
	 * Default constructor
	 */
	public Transaction() {
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param trader
	 * @param year
	 * @param value
	 */
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	/**
	 * Getters and setters for alll attributes of fruit object
	 */
	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * Overridden toString() method
	 */
	@Override
	public String toString() {
		return "Trader: " + trader + ", Year: " + year + ", Value: " + value;
	}

}
