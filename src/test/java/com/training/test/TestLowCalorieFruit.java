package com.training.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.training.classes.LowCalorieFruitFinder;
import com.training.models.Fruit;

public class TestLowCalorieFruit {

	private LowCalorieFruitFinder lcff;

	/**
	 * Executes before very test case
	 */
	@Before
	public void setup() {
		lcff = new LowCalorieFruitFinder();
	}

	/**
	 * Method to test whether LowCalorieFruitFinder class returns correct list of
	 * fruits
	 */
	@Test
	public void testLowCalorieFruitsFinder() {
		List<Fruit> fruits = new ArrayList<>();
		Fruit f1 = new Fruit("Apple", 27, 100, "Red");
		Fruit f2 = new Fruit("Pomegranate", 100, 200, "Red");
		Fruit f3 = new Fruit("Mango", 95, 150, "Yellow");
		Fruit f4 = new Fruit("Grapes", 50, 180, "Green");
		Fruit f5 = new Fruit("Banana", 120, 50, "Yellow");
		fruits.add(f1);
		fruits.add(f2);
		fruits.add(f3);
		fruits.add(f4);
		fruits.add(f5);

		List<Fruit> expected = new ArrayList<>();
		expected.add(f3);
		expected.add(f4);
		expected.add(f1);
		Assert.assertEquals(expected, lcff.lowCalorie(fruits));
	}
	
	/**
	 * Executes after every test case
	 */
	@After
	public void tearDown() {
		lcff = null;
	}
}
