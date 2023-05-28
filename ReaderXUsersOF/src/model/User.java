package model;

import java.util.Calendar;

public abstract class User {

	private String id;
	private String name;
	private Calendar signUpDate;
	

	public User(String id, String name) {

		
		this.id = id;
		this.name = name;
		
		this.signUpDate= Calendar.getInstance();

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Calendar getSignUpDate() {
		return signUpDate;
	}

	public void setSignUpDate(Calendar signUpDate) {
		this.signUpDate = signUpDate;
	}

	@Override
	public String toString() {
		return "User \n id=" + id + "\n name=" + name ;
	}

}
