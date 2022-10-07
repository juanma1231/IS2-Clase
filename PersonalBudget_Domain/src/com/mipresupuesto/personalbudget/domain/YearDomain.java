package com.mipresupuesto.personalbudget.domain;

public final class YearDomain {

	private  String id;
	private int year;
	
	private YearDomain(String id, int year) {
		this.id = id;
		this.year = year;
	}
	
	public static YearDomain create(String id, int year) {
		return new YearDomain(id, year);
	}
	
	public final void setId(String id) {
		this.id = (id == null) ? "" : id.trim(); 
	}

	private final void setYear(int year) {
		this.year = year;
	}

	public final String getId() {
		return id;
	}
//No se pueden modificar ni heredar los FINAL
	public final int getYear() {
		return year;
	}
	
	
}
