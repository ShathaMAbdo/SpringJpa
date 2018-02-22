package com.shatha.school.repositories;

import javax.transaction.Transactional;

import com.shatha.school.domain.entities.Person;

@Transactional
public interface PersonRepository extends PersonBaseRepositories<Person>   {

}
