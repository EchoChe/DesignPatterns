package main.java.criteria;

import java.util.ArrayList;
import java.util.List;

import main.java.Person;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCiteria(List<Person> persons) {
		List<Person> malePerson = new ArrayList<Person>();
		for(Person person : persons)
		{
			if (person.getMatritalStatus().equals("MALE")) {
				malePerson.add(person);
			}
		}
		return malePerson;
	}

}
