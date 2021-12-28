package implementation;

import interfaces.Job;
import interfaces.Person;

public class PersonImpl implements Person {

	private int age;
	private String name;
	
	public PersonImpl(String n, int a) {
		// Defines the elements of a person
		this.name = n;
		this.age = a;
	}
	
	@Override
	public String getName() {
		// Retrieves the person's name
		return name;
	}

	@Override
	public int getAge() {
		// Retrieves the input age
		return age;
	}

	@Override
	public Job getJob() {
		return getJob();
	}

	@Override
	public void setJob(Job j) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void setAge(int a) {
		// Makes sure the age is a valid number (i.e. not negative)
		if (a >= 0) {
			this.age = a;
		}
	}

	@Override
	public void setName(String n) {
		// Makes sure a valid name is entered and the field isn't left blank
		if (n != null && !n.equals("")) {
			this.name = n;
		}
		
	}

	@Override
	public boolean equals(Person p) {
		// Checks if the person is the same as a newly input person
			if (p == null) {
				return false;
			}
			if (p == this) {
				return true;
			}
			return false;
			
		}

	@Override
	public boolean olderThan(Person p) {
		// Checks if the person is older than the newly input person
		if ( this.age > p.getAge() ) {
		return true;
		}
		return false;
	}

	@Override
	public boolean youngerThan(Person p) {
		// Checks if the person is older than the newly input person
		if ( this.age < p.getAge() ) {
		return true;
		}
		return false;
	}

	@Override
	public boolean isAdult() {
		// Checks if the person is over 18 (and therefore allowed to work at the company)
		if ( this.age < 18 ) {
		return false;
	}
	
	return true;
	}

	@Override
	public boolean isColleague(Person p) {
		return false;
	}



}
