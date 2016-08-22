package main.java.criteria;

import java.util.ArrayList;
import java.util.List;

import main.java.Person;

public class CriterialFemale implements Criteria {

	@Override
	public List<Person> meetCiteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();
		
		for(Person person : persons)
		{
			if(person.getMatritalStatus().equals("FEMALE"))
				femalePersons.add(person);
		}
		return femalePersons;
	}

}
