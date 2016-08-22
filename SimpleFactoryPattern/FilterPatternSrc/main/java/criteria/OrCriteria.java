package main.java.criteria;

import java.util.List;

import main.java.Person;

public class OrCriteria implements Criteria {

	private Criteria criteria;
	private Criteria oterCriteria;
	
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.oterCriteria = otherCriteria;
	}
	
	@Override
	public List<Person> meetCiteria(List<Person> persons) {
		List<Person> firstCriteria = criteria.meetCiteria(persons);
		List<Person> otherCriteriaItems = oterCriteria.meetCiteria(persons);
		
		for(Person person : otherCriteriaItems)
		{
			if(!firstCriteria.contains(person))
			{
				firstCriteria.add(person);
			}
		}
		
		return firstCriteria;
	}

}
