package com.shatha.school.repositories;

import javax.transaction.Transactional;

import com.shatha.school.domain.entities.Teacher;

@Transactional
public interface TeacherRepository extends PersonBaseRepositories<Teacher> {

}
