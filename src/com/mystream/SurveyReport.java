package com.mystream;

public class SurveyReport {
	public SurveyReport(int surveyid, String employeeName, String location, int total_connection_request,
			int no_of_days_for_request_completion, int average_request_per_day) {
		super();
		this.surveyid = surveyid;
		this.employeeName = employeeName;
		this.location = location;
		this.total_connection_request = total_connection_request;
		this.no_of_days_for_request_completion = no_of_days_for_request_completion;
		this.average_request_per_day = average_request_per_day;
	}
	private int surveyid;
	private String employeeName;
	private String location;
	private int total_connection_request;
	private int no_of_days_for_request_completion;
	private int average_request_per_day;
	public int getSurveyid() {
		return surveyid;
	}
	public void setSurveyid(int surveyid) {
		this.surveyid = surveyid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTotal_connection_request() {
		return total_connection_request;
	}
	public void setTotal_connection_request(int total_connection_request) {
		this.total_connection_request = total_connection_request;
	}
	public int getNo_of_days_for_request_completion() {
		return no_of_days_for_request_completion;
	}
	public void setNo_of_days_for_request_completion(int no_of_days_for_request_completion) {
		this.no_of_days_for_request_completion = no_of_days_for_request_completion;
	}
	public int getAverage_request_per_day() {
		return average_request_per_day;
	}
	public void setAverage_request_per_day(int average_request_per_day) {
		this.average_request_per_day = average_request_per_day;
	}
	@Override
	public String toString() {
		return "SurveyReport [surveyid=" + surveyid + ", employeeName=" + employeeName + ", location=" + location
				+ ", total_connection_request=" + total_connection_request + ", no_of_days_for_request_completion="
				+ no_of_days_for_request_completion + ", average_request_per_day=" + average_request_per_day + "]";
	}
	

}
