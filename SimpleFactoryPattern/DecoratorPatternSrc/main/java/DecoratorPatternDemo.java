package main.java;

import main.java.shape.Circle1;
import main.java.shape.Rectangle1;
import main.java.shape.Shape1;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Shape1 circle = new Circle1();
		Shape1 redCircle = new RedShapeDecorator(new Circle1());
		Shape1 redRectangle = new RedShapeDecorator(new Rectangle1());
		
		System.out.println("circle with normal boeder");
		circle.draw();
		
		System.out.println("Circle of red border");
		redCircle.draw();
		
		System.out.println("Rectangle of red boeder");
		redRectangle.draw();
	}
}
