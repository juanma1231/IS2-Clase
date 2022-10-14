package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

public class YearEntity {
	
	private UUID id;
	private int year;
	
	public YearEntity() {
		setYear(0);
	}
	
	public static final YearEntity create() {
		return new YearEntity();
	}
	
	public YearEntity(UUID id, int year) {
		this.id = id;
		this.year = year;
	}
	
	public final UUID getId() {
		return id;
	}

	public final void setId(final UUID id) {
		this.id = id;
	}
	
	public final int getYear() {
		return year;
	}
	
	public final void setYear(int year) {
		this.year = year;
	}
	
}
