package test.java;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.java.Person;
import main.java.criteria.AndCriteria;
import main.java.criteria.Criteria;
import main.java.criteria.CriteriaMale;
import main.java.criteria.CriteriaSingle;
import main.java.criteria.CriterialFemale;
import main.java.criteria.OrCriteria;

public class CriteriaPatternTest {

	
	
	
	@Test
	public void test() {
		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura","Female", "Married"));
	    persons.add(new Person("Diana","Female", "Single"));
	    persons.add(new Person("Mike","Male", "Single"));
	    persons.add(new Person("Bobby","Male", "Single"));

	    Criteria male = new CriteriaMale();
	    Criteria female = new CriterialFemale();
	    Criteria single = new CriteriaSingle();
	    Criteria singleFemale = new AndCriteria(single, male); 
	    Criteria singleOrFemale = new OrCriteria(single, female);
	    
	    System.out.println("Males: ");
	    Person.printPersons(male.meetCiteria(persons));
	    
	    System.out.println("Females:");
	    Person.printPersons(female.meetCiteria(persons));
	    
	    System.out.println("Single:");
	    Person.printPersons(singleFemale.meetCiteria(persons));
	    
	    System.out.println("Single or female:");
	    Person.printPersons(singleOrFemale.meetCiteria(persons));
	    
	    
	}

}
