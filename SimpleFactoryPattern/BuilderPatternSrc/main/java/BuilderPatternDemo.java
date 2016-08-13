package main.java;

import main.java.meal.Meal;
import main.java.meal.MealBilder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBilder mealBilder = new MealBilder();
		
		Meal vegMeal = mealBilder.prepareVegMeal();
		System.out.println("Veg Meal\n");
		vegMeal.showItems();
		System.out.println("Total Cost :" + vegMeal.getCost() + "\n");
		
		Meal nonVeg = mealBilder.prepareNoVegMeal();
		System.out.println("Non-veg Meal\n");
		nonVeg.showItems();
		System.out.println("Total Cost :" + nonVeg.getCost());
	}
}
