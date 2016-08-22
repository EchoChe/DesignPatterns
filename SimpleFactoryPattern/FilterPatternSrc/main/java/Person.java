package main.java;

import java.util.List;

public class Person {
	private String name = "";
	private String gender = "";
	private String matritalStatus = "";//»éÒö×´Ì¬
	
	public Person(String name, String gender, String matritalStatus) {
		this.name = name;
		this.gender = gender;
		this.matritalStatus = matritalStatus;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getMatritalStatus() {
		return matritalStatus;
	}
	
	public static void printPersons(List<Person> persons)
	{
		System.out.println("Hello");
		for(Person person : persons)
		{
			
			System.out.println("Person: name" + person.getName() + ",Gender" + person.getGender() + ", Marital Status:" + person.getMatritalStatus());
		}
	}
	
}
