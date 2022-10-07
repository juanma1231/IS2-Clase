package com.mipresupuesto.personalbudget.domain;

public class PersonDomain {

	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String lastName;
	
	private PersonDomain(String id, String idCard, String firstName, String middleName, String lastName) {
		this.id = id;
		this.idCard = idCard;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public static PersonDomain create(String id, String idCard, String firstName, String middleName, String lastName) {
		return new PersonDomain(id, idCard, firstName, middleName, lastName);
	}
	
	public final void setId(String id) {
		this.id = (id == null) ? "" : id.trim(); 
	}
	
	public final void setidCard(String idCard) {
		this.idCard = (idCard == null) ? "" : idCard.trim(); 
	}
	
	public final void setfirstName(String firstName) {
		this.firstName = (firstName == null) ? "" : firstName.trim(); 
	}
	
	public final void setmiddleName(String middleName) {
		this.middleName = (middleName == null) ? "" : middleName.trim(); 
	}
	
	public final void setlastName(String lastName) {
		this.lastName = (lastName == null) ? "" : lastName.trim(); 
	}

	public final String getId() {
		return id;
	}

	public final String getIdCard() {
		return idCard;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final String getMiddleName() {
		return middleName;
	}

	public final String getLastName() {
		return lastName;
	}
	
}
