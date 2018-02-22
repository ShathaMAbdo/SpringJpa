package com.shatha.school.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shatha.school.domain.entities.Subject;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long> {

}
