package main.java;

public class IteratorPatternDemo {
	public static void main(String[] args) {
		NameResponsity nameResponsity = new NameResponsity();
		
		for(Iterator iterator = nameResponsity.getIterator(); iterator.hasNext();)
		{
			String name = (String)iterator.next();
			System.out.println("Name: "+ name);
		}
	}
}
