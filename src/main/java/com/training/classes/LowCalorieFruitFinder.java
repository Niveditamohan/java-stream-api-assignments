package com.training.classes;

import java.util.List;
import java.util.stream.Collectors;

import com.training.models.Fruit;

/**
 * CLass to collect fruits with low calorie
 * METHODS: filter(), sorted(), collect()
 * 
 * @author mnivedi1
 *
 */
public class LowCalorieFruitFinder {

	public List<Fruit> lowCalorie(List<Fruit> fruits) {
		List<Fruit> result = fruits.stream().filter(fruit -> fruit.getCalories() < 100).sorted((f1, f2) -> {
			int res = Integer.compare(f2.getCalories(), f1.getCalories());
			if (res == 0)
				return Integer.compare(f1.getPrice(), f2.getPrice());
			return res;
		}).collect(Collectors.toList());
		return result;
	}
}
