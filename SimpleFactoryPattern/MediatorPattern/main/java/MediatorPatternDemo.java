package main.java;

public class MediatorPatternDemo {
	public static void main(String[] args) {
		User robert = new User("Robert");
		User John = new User("John");
		
		robert.sendMessage("Hi, John");
		John.sendMessage("Hi! Robert");
	}
}
