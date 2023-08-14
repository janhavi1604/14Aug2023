package com.mystream;

public class Department {
	public Department(String departmentNmae, String location) {
		super();
		this.departmentNmae = departmentNmae;
		this.location = location;
	}
	private String departmentNmae;
	private String location;
	public String getDepartmentNmae() {
		return departmentNmae;
	}
	public void setDepartmentNmae(String departmentNmae) {
		this.departmentNmae = departmentNmae;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [departmentNmae=" + departmentNmae + ", location=" + location + "]";
	}

}
