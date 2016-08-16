package main.java;

public class Circle implements Shape {

	private String color = "";
	private int x = 0;
	private int y = 0;
	private int radius = 0;
	
	public Circle(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle: Draw() [Color£º" + color + ",x:" + x +"y:" +y + ",radius:" + radius);
	}

}
