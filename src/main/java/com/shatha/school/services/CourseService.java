package com.shatha.school.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shatha.school.domain.entities.Course;
import com.shatha.school.repositories.CourseRepository;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepo;
	
	public void addCourse(Course course) {
		courseRepo.save(course);
	}
	public void uppdateCourse(Course course) {
		courseRepo.save(course);
	}
	public void deletCourse(Course course) {
		courseRepo.delete(course);
	}
	public void getCourseBuId(Long id) {
		courseRepo.findOne(id);
	}
	
	
	public List<Course> getCoursesByStudent(Long StudentId) {
		List<Course> courses=new ArrayList<>();
		courseRepo.getAllByStudent(StudentId).forEach(courses::add);
		return courses;
	}
	
	public List<Course> getCoursesBySubject(Long SubjectId) {
		List<Course> courses=new ArrayList<>();
		courseRepo.getAllBySubject(SubjectId).forEach(courses::add);
		return courses;
	}

}
