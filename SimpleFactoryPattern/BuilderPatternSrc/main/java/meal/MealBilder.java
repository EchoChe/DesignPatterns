package main.java.meal;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import main.java.item.Coke;
import main.java.item.Pepsi;
import main.java.item.VegBurger;
import main.java.item.chickenBurger;

public class MealBilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		
		return meal;
	}
	
	public Meal prepareNoVegMeal()
	{
		Meal meal = new Meal();
		meal.addItem(new chickenBurger());
		meal.addItem(new Pepsi());
		
		return meal;
	}
}
