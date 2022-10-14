package com.mipresupuesto.personalbudget.domain;

public final class BudgetDomain {
	
	private YearDomain year;
	private PersonDomain person;
	
	private BudgetDomain(final YearDomain year, final PersonDomain person) {
		setYear(year);
		setPerson(person);
	}
	
	public static final BudgetDomain create(final YearDomain year, final PersonDomain person) {
		return new BudgetDomain(year, person);
	}

	private final YearDomain getYear(final YearDomain year) {
		return year;
	}

	private final void setYear(YearDomain year) {
		this.year = year;
	}

	private final PersonDomain getPerson() {
		return person;
	}

	private final void setPerson(PersonDomain person) {
		this.person = person;
	}
	
	
}
