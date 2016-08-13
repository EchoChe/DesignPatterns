package main.java.item;

import main.java.pack.Packing;
import main.java.pack.Wrapper;

public abstract class Burger implements Item{
	@Override
	public Packing packing()
	{
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
}
