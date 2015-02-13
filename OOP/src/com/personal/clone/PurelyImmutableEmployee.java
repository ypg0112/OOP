package com.personal.clone;

import java.util.Date;

public class PurelyImmutableEmployee {

	private final int id;
	private final String name;
	private final Date startDate;
	private final Date endDate;
	
	public PurelyImmutableEmployee(int id, String name, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getStartDate() {
		return new Date(startDate.getTime());
	}

	public Date getEndDate() {
		return new Date(endDate.getTime());
	}
	
}
