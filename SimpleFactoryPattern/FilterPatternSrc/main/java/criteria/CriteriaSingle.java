package main.java.criteria;

import java.util.ArrayList;
import java.util.List;

import main.java.Person;

public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCiteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();
		
		for(Person person : persons)
		{
			if(person.getMatritalStatus().equals("SINGLE"))
				singlePersons.add(person);
		}
		
		return singlePersons;
	}

}
