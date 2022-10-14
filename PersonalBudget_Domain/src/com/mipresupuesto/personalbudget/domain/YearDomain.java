package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

public final class YearDomain {

	private  UUID id;
	private int year;
	
	private YearDomain(UUID id, int year) {
		this.id = id;
		this.year = year;
	}
	
	public static YearDomain create(UUID id, int year) {
		return new YearDomain(id, year);
	}
	
	public final void setId(UUID id) {
		this.id = (id== null) ? UUID.randomUUID() : id;
	}

	private final void setYear(int year) {
		this.year = year;
	}

	public final UUID getId() {
		return id;
	}
//No se pueden modificar ni heredar los FINAL
	public final int getYear() {
		return year;
	}
	
	
}
