package com.shatha.school.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shatha.school.domain.entities.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

	public List<Course> getAllBySubject(Long subjectId);
	public List<Course> getAllByStudent(Long StudentId);
	
	
	
	}

