package main.java;

public class SingleObject {
	//����һ��SingleObject��һ������
	private static SingleObject instance = new SingleObject();
	
	//�ù��캯��Ϊprivate���ⰺ�Ͳ��ᱻʵ����
	private SingleObject() {
	}

	//��ȡΨһ���õĶ���
	public static SingleObject getInstance() {
		return instance;
	}
	
	public String showMessage() {
		String string = "Hello world";
		return string;
	}
}
