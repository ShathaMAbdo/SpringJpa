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
public class Teacher extends Person{

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	@JoinColumn(name = "Subject_FK")
	private List <Subject> subjects;
	

	public Teacher() {
	
	}

	public Teacher(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastNamr=lastName;
		subjects=new ArrayList();
		
		
	}
	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Teacher [subjects=" + subjects + ", Id=" + Id + ", firstName=" + firstName + ", lastNamr=" + lastNamr
				+ "]";
	}

	
	
	
}
