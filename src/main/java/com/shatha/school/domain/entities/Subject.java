package com.shatha.school.domain.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;


@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long SubId;
	private String SubName;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	@JoinColumn(name = "Course_FK")
	
	private List <Course> Sub_Courses;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	@JoinColumn(name = "Teacher_FK")
	
	private List <Teacher> Sub_Teachers;
	
	public Subject() {
		Sub_Teachers=new ArrayList();
	}
	

	public Subject(String subName) {
		this.SubName = subName;
		Sub_Teachers=new ArrayList();
	}


	public String getSubName() {
		return SubName;
	}

	public void setSubName(String subName) {
		SubName = subName;
	}

	public List<Course> getSub_Courses() {
		return Sub_Courses;
	}

	public void setSub_Courses(List<Course> sub_Courses) {
		Sub_Courses = sub_Courses;
	}

	public List<Teacher> getSub_Teachers() {
		return Sub_Teachers;
	}

	public void setSub_Teachers(List<Teacher> sub_Teachers) {
		Sub_Teachers = sub_Teachers;
	}

	public long getSubId() {
		return SubId;
	}


	@Override
	public String toString() {
		return "Subject [SubId=" + SubId + ", SubName=" + SubName + ", Sub_Courses=" + Sub_Courses + ", Sub_Teachers="
				+ Sub_Teachers + "]";
	}
	
}
