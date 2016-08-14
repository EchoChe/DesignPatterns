package main.java;

import java.util.Hashtable;


import main.java.shape.Circle;
import main.java.shape.Rectangle;
import main.java.shape.Shape;
import main.java.shape.Square;

public class ShapeCache {
	
	private static Hashtable<String, Shape> shapeMap
		= new Hashtable<String, Shape>();
	
	public static Shape getShape(String shanpeId) throws CloneNotSupportedException {
		Shape cacheShape = shapeMap.get(shanpeId);
		return (Shape)cacheShape.clone();
	}
	
/*
 * 对每种形状都运行数据库查询，并创建该形状
 * shapeMap.put(shapeKey,shape);
 * 例如，我们要添加三种形状	
 */
public static void  loadCache() {
	Circle circle = new Circle();
	circle.setId("1");
	shapeMap.put(circle.getId(), circle);

	Square square = new Square();
	square.setId("2");
	shapeMap.put(square.getId(), square);
	
	Rectangle rectangle = new Rectangle();
	rectangle.setId("3");
	shapeMap.put(rectangle.getId(), rectangle);
}
}
