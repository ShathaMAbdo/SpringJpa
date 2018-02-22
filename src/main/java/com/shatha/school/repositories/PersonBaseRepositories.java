package com.shatha.school.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.shatha.school.domain.entities.Person;

@NoRepositoryBean
public interface PersonBaseRepositories <T extends Person> extends CrudRepository<T, Long> {
	
	public T findByName(String Name);

}
