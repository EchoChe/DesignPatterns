package main.java;

public class Stock {
	private String name = "abcStock";
	private int quantity = 20;
	
	public void buy() {
		System.out.println("Stock [Name:" + name + "Quantity:" + quantity +"]bought");
	}
	
	public void sell() {
		System.out.println("Stock [Name:" + name + "Quantity:" + quantity +"]sold");
	}
	
}
