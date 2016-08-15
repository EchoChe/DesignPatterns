package main.java;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name = "";
	private String dept = "";
	private int salary = 0;
	private List<Employee> subordinates;
	
	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.subordinates = new ArrayList<Employee>();
	}
	
	public void add(Employee e) {
		subordinates.add(e);
	}
	
	public void remove(Employee e) {
		subordinates.remove(e);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}
	
	@Override
	public String toString() {
		String string = "name:" + name + "dept:" + dept + "salary:" + salary + "\n";
		return string;
	}
}
