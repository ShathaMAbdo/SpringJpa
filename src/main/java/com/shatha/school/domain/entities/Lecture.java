package com.shatha.school.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Lecture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long LectureId;
	private String LectureTitle;
	
	@ManyToOne
	private Course course;
	
	public Lecture() {
		
	}

	public Lecture( String lectureTitle, Course course) {
		this.LectureTitle = lectureTitle;
		this.course = course;
	}

	public String getLectureTitle() {
		return LectureTitle;
	}

	public void setLectureTitle(String lectureTitle) {
		LectureTitle = lectureTitle;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Lecture [LectureId=" + LectureId + ", LectureTitle=" + LectureTitle + ", course=" + course + "]";
	}
	

}
