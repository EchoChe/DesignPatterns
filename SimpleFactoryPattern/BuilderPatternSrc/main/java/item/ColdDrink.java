package main.java.item;

import main.java.pack.Bottle;
import main.java.pack.Packing;

public abstract class ColdDrink implements Item{
	@Override
	public Packing packing()
	{
		return new Bottle();
	}
	
	@Override
	public abstract float price();
}
