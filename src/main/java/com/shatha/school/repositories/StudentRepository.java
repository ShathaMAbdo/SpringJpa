package com.shatha.school.repositories;

import javax.transaction.Transactional;

import com.shatha.school.domain.entities.Student;

@Transactional
public interface StudentRepository extends PersonBaseRepositories<Student> {

}
