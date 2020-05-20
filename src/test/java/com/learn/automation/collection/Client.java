package com.learn.automation.collection;

public class Client {

	private String firstName;
	private String lastName;
	private String ssn;
	private Integer age;
	Object object;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Client [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + ", age=" + age
				+ ", object=" + object + "]";
	}
	
	
}
