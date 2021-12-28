package implementation;

import interfaces.Job;

public class JobImpl implements Job {

	
	private String title;
	private double salary;
	private String company;
	
	public JobImpl(String t, int s, String c) {
		this.title = t;
		this.salary = s;
		this.company = c;
	}

	@Override
	public double getSalary() {
		// Retrieves the input salary
		return salary;
	}

	@Override
	public String getTitle() {
		// Retrieves the input job title
		return title;
	}

	@Override
	public void setSalary(double s) {
		// Makes sure the salary is a valid value (i.e. not negative or zero)
		if (s > 0) {
			this.salary = s;
		}

	}

	@Override
	public void setTitle(String t) {
		// Makes sure the title is a valid value (i.e not blank)
		if (!t.equals("")) {
			this.title = t;
		}
		
	}

	@Override
	public String getCompany() {
		// Retrieves the input company of employment
		return company;
	}

	@Override
	public void setCompany(String c) {
		// Makes sure the name of the company is valid (i.e. not blank)
		if (c != "") {
		this.company = c;
		}
	}

	@Override
	public boolean equals(Job p) {
		return false;
	}

}
