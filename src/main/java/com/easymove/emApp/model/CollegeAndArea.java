package com.easymove.emApp.model;

public class CollegeAndArea {
	private String collegeName;
	private String course;
	private String type;
	private String university;
	private String address;
	private String collegeDescription;
	private String area_name;
	private String description;
	private String saftey_level;
	private String transports_available;
	private String market;
	public CollegeAndArea(String collegeName, String course, String type, String university, String address,
			String collegeDescription, String area_name, String description, String saftey_level,
			String transports_available, String market) {
		super();
		this.collegeName = collegeName;
		this.course = course;
		this.type = type;
		this.university = university;
		this.address = address;
		this.collegeDescription = collegeDescription;
		this.area_name = area_name;
		this.description = description;
		this.saftey_level = saftey_level;
		this.transports_available = transports_available;
		this.market = market;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getArea_name() {
		return area_name;
	}
	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSaftey_level() {
		return saftey_level;
	}
	public void setSaftey_level(String saftey_level) {
		this.saftey_level = saftey_level;
	}
	public String getTransports_available() {
		return transports_available;
	}
	public void setTransports_available(String transports_available) {
		this.transports_available = transports_available;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeDescription() {
		return collegeDescription;
	}
	public void setCollegeDescription(String collegeDescription) {
		this.collegeDescription = collegeDescription;
	}

}
