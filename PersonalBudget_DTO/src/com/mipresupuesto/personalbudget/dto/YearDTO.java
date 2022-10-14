package com.mipresupuesto.personalbudget.dto;

public class YearDTO {
	private String id;
	private int year;
	
	public YearDTO() {
		setId("");
		setYear(0);
	}
	
	public static final YearDTO create() {
		return new YearDTO();
	}
	
	public YearDTO(String id, int year) {
		this.id = id;
		this.year = year;
	}
	
	public final String getId() {
		if(id==null || "".equals(id.trim())) {
			setId("");
		}
		return id;
	}

	public final void setId(final String id) {
		this.id = id;
	}
	
	public final int getYear() {
		return year;
	}
	
	public final void setYear(int year) {
		this.year = year;
	}
	
	
}
