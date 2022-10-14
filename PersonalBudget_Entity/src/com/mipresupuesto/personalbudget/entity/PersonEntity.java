package com.mipresupuesto.personalbudget.entity;

public class PersonEntity {
	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSurname;
	private String secondSurname;
	private String name;
	private String lastName;
	private String completeName;
	
	public PersonEntity() {
		setId("");
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirstSurname("");
		setSecondSurname("");
		setName("");
		setLastName("");
		setCompleteName("");
	}
	//Desactiva sonarlint esta vuelta cuidado
	@SuppressWarnings("all")
	public PersonEntity(String id, String idCard, String firstName, String middleName, String firstSurname,
			String secondSurname, final String name, final String lastName, final String completeName) {
		this.id = id;
		this.idCard = idCard;
		this.firstName = firstName;
		this.middleName = middleName;
		this.firstSurname = firstSurname;
		this.secondSurname = secondSurname;
	}

	
	
	public final String getName() {
		if(name==null) {
			setName("");
		}
		return name.trim();
	}



	public final void setName(String name) {
		this.name = name;
	}



	public final String getLastName() {
		if(lastName==null) {
			setLastName("");
		}
		return lastName.trim();
	}



	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public final String getCompleteName() {
		if(completeName==null) {
			setCompleteName("");
		}
		return completeName;
	}



	public final void setCompleteName(String completeName) {
		this.completeName = completeName;
	}



	public static final PersonEntity create() {
		return new PersonEntity();
	}
	
	public final String getId() {
		return id;
	}
	public final void setId(String id) {
		this.id = id;
	}
	public final String getIdCard() {
		return idCard;
	}
	public final void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public final String getFirstName() {
		return firstName;
	}
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public final String getMiddleName() {
		return middleName;
	}
	public final void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public final String getFirstSurname() {
		return firstSurname;
	}
	public final void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}
	public final String getSecondSurname() {
		return secondSurname;
	}
	public final void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
}
