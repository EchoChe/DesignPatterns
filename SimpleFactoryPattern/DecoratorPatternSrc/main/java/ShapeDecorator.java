package main.java;

import main.java.shape.Shape1;

public abstract class ShapeDecorator implements Shape1{
	protected Shape1 decorateShape;
	
	public ShapeDecorator(Shape1 decoratorShape) {
		this.decorateShape = decorateShape;
	}
	
	public void draw() {
		decorateShape.draw();
	}
}
