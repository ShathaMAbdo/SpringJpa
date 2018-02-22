package com.shatha.school.domain.entities;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected long Id;
	protected String firstName;
	protected String lastNamr;
	
}
