// SQM - JUnit Assessment help done

package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import interfaces.Employer;
import interfaces.Person;

public class EmployerImpl implements Employer {

	private String name;
	private List<Person> employees;
	
	public EmployerImpl(String n) {
		this.name = n;
		employees = new ArrayList<Person>();
	}

	@Override
	public void hire(Person p, String title, double salary) {
		// set up employee with job
		employees.add(p);
	}

	@Override
	public List<Person> getEmployees() {
		// get list of employees
		return employees;
	}

	@Override
	public int getEmployeeCount() {
		return employees.size();
	}
	
	
	@Override
	public boolean fire(Person p) {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isEmployed(Person p) {
	
		for (Person person : employees) {
			if (p.getName().equals(name)) {
				return true;
			}			
		}
		return false;
	}

	@Override
	public Person getHighestPaid() {
//		if (p.getHighestPaid().equals(this.salary)) {
//			return person;
//		}
//		
		
		return null;
	}

	@Override
	public Person getLowestPaid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getStaffCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCountOf(String title) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Person> getAll(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
