package com.easymove.emApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="college", catalog="emapp")
public class College {
	@Id
	@Column(name = "college_id")
	private int collegeId;
	@Column(name = "college_name")
	private String collegeName;
	@Column(name = "course")
	private String course;
	@Column(name = "type")
	private String type;
	@Column(name = "university")
	private String university;
	@Column(name = "address")
	private String address;
	@Column(name = "college_description", columnDefinition = "TEXT")
	private String collegeDescription;
	@Column(name = "area_id")
	private int areaId;
	@Column(name = "city_id")
	private int cityId;
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
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
	public String getCollegeDescription() {
		return collegeDescription;
	}
	public void setCollegeDescription(String collegeDescription) {
		this.collegeDescription = collegeDescription;
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	

}
