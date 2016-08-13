package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.java.SingleObject;

public class SingleObjectTest {

	@Test
	public void test() {
		
		//不合法的构造
		//编译错误，构造函数SingleObjec() 是不可见的
		//SingleObject object = new SingleObject();
		
		//获取唯一可用的对象
		SingleObject object = SingleObject.getInstance();
		
		//验证消息
		Assert.assertEquals("Hello world", object.showMessage());
	}

}
