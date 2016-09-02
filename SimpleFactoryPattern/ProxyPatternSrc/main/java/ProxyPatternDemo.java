package main.java;

public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jog");
		
		image.display();
		System.out.println("");
		image.display();
	}
}
