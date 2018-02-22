package com.shatha.school.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shatha.school.domain.entities.Lecture;

@Repository
public interface LectureRepository extends CrudRepository<Lecture, Long> {

}
