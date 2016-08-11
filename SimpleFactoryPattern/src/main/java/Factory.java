package main.java;

public class Factory {
	public  Product createProduct(String string) {
		if(string == "A")
			return new ConcreteProductA();
		else if(string == "B")
			return new ConcreteProductB();
		return null;
	}
}
