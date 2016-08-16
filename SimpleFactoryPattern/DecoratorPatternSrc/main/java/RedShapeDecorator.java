package main.java;

import main.java.shape.Shape1;

public class RedShapeDecorator extends ShapeDecorator {
	public RedShapeDecorator(Shape1  decoratorShape) {
		super(decoratorShape);
	}
	
	@Override
	public void draw()
	{
		decorateShape.draw();
		setRedBorder(decorateShape);
	}
	
	public void setRedBorder(Shape1 decorateShape) {
		System.out.println("Border Color : Red");
	}
	
}
