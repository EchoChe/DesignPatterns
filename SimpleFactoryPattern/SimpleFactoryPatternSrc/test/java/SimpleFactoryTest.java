package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.java.Factory;
import main.java.Product;

public class SimpleFactoryTest {

	@Test
	public void test() {
		Factory factory = new Factory();
		Product paProduct = factory.createProduct("A");
		Product pbProduct = factory.createProduct("B");
		
		Assert.assertEquals("ConcreteProductA class \n", paProduct.use());
		Assert.assertEquals("ConcreteProductB class \n", pbProduct.use());
	}

}
