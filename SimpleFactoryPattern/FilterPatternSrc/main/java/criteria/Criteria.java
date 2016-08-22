package main.java.criteria;

import java.util.List;

import main.java.Person;

public interface Criteria {
	public List<Person> meetCiteria(List<Person> persons);
}
