package test.java;

import org.junit.Test;

import junit.framework.Assert;
import main.java.ShapeCache;
import main.java.shape.Shape;

public class PrototypePatternTest {

	@Test
	public void test() throws CloneNotSupportedException {
		ShapeCache.loadCache();
		
		Shape cloneShape = (Shape) ShapeCache.getShape("1");
		Assert.assertEquals("Circle", cloneShape.getType());
		
		Shape cloneShape2 = (Shape) ShapeCache.getShape("2");
		Assert.assertEquals("Square", cloneShape2.getType());
		
		Shape cloneShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println(cloneShape3.getType());
		
	}

}
