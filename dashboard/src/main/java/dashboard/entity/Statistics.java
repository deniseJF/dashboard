package dashboard.entity;

import java.util.ArrayList;
import java.util.List;

public class Statistics {

	private List<Person> personsList;
	
	public Statistics(){
		personsList = new ArrayList<Person>();
	}
	
	public void addPerson(Person person){
		personsList.add(person);
	}
	
	public List<Person> getPersonList(){
		return this.personsList;
	}
}
