package main.java.criteria;

import java.util.List;

import main.java.Person;

public class AndCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	@Override
	public List<Person> meetCiteria(List<Person> persons) {
		List<Person> firstCrteriaPersons = criteria.meetCiteria(persons);
		return otherCriteria.meetCiteria(firstCrteriaPersons);
	}

}
