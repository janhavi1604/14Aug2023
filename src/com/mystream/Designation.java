package com.mystream;

public class Designation {

	public Designation(String designation_type) {
		super();
		this.designation_type = designation_type;
	}

	private String designation_type;

	public String getDesignation_type() {
		return designation_type;
	}

	public void setDesignation_type(String designation_type) {
		this.designation_type = designation_type;
	}

	@Override
	public String toString() {
		return "Designation [designation_type=" + designation_type + "]";
	}
}
