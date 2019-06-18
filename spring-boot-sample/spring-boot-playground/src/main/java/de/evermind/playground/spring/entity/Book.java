package de.evermind.playground.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue
	private Long number;

	private String name;

	public Long getId() {
		return number;
	}
	
	public Long getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getBeer() {
		return "beer";
	}

	// standard constructors

	// standard getters and setters
}