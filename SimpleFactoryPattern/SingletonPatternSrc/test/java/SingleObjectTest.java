package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.java.SingleObject;

public class SingleObjectTest {

	@Test
	public void test() {
		
		//���Ϸ��Ĺ���
		//������󣬹��캯��SingleObjec() �ǲ��ɼ���
		//SingleObject object = new SingleObject();
		
		//��ȡΨһ���õĶ���
		SingleObject object = SingleObject.getInstance();
		
		//��֤��Ϣ
		Assert.assertEquals("Hello world", object.showMessage());
	}

}
