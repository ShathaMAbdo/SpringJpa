package com.shatha.school.domain.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )

public class Student extends Person {
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	@JoinColumn(name = "Course_FK")
	private List <Course> courses;
	
	public Student() {
		courses=new ArrayList();
		
	}
	public Student(String firstName,String lastName) {
			this.firstName=firstName;
			this.lastNamr=lastName;
			courses=new ArrayList();
			}
	
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Student [courses=" + courses + ", firstName=" + firstName + ", lastNamr=" + lastNamr + "]";
	}
	

}
