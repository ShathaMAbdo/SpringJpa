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
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long CourseId;
	private String courseTitle;
	
	@OneToMany( cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	private List<Lecture> course_lectures;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	@JoinColumn(name = "Subject_FK")
	private List<Subject> course_subjects;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	@JoinColumn(name = "Student_FK")
	private List<Student> students;
	
	
 public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

public Course() {
	 course_lectures=new ArrayList();
	 course_subjects=new ArrayList();
	 students=new ArrayList();
 }

public Course(String courseTitle) {

	this.courseTitle = courseTitle;
	 course_lectures=new ArrayList();
	 course_subjects=new ArrayList();
	 students=new ArrayList();
 }

public String getCourseTitle() {
	return courseTitle;
}

public void setCourseTitle(String courseTitle) {
	this.courseTitle = courseTitle;
}

public List<Lecture> getCourse_lectures() {
	return course_lectures;
}

public void setCourse_lectures(List<Lecture> course_lectures) {
	this.course_lectures = course_lectures;
}

public List<Subject> getCourse_subjects() {
	return course_subjects;
}

public void setCourse_subjects(List<Subject> course_subjects) {
	this.course_subjects = course_subjects;
}

public long getCourseId() {
	return CourseId;
}

@Override
public String toString() {
	return "Course [CourseId=" + CourseId + ", courseTitle=" + courseTitle + ", course_lectures=" + course_lectures
			+ ", course_subjects=" + course_subjects + ", students=" + students + "]";
}




}
 
 

