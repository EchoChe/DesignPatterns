package main.java;

public class FlyweightPatternDemo {
	private static final String colors[] = 
		{"Red", "Green", "Blue", "Write", "Black"};
	
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++)
		{
			Circle circle = 
					(Circle)ShapeFactory.getCircle(getRadomColor());
			circle.setX(getRadomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}
	
	private static String getRadomColor() {
		return colors[(int)(Math.random() * colors.length)];
	}
	
	private static int getRadomX() {
		return (int)(Math.random() * 100);
	}
	
	private static int getRandomY() {
		return (int)(Math.random() * 100);
	}
	
}
