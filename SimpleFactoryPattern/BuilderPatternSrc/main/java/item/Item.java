package main.java.item;

import main.java.pack.Packing;

public interface Item {
	public String name();
	public Packing packing();
	public float price();
}
