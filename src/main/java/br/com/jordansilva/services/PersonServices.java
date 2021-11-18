package br.com.jordansilva.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.jordansilva.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();

	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Jordan");
		person.setLastName("Silva");
		person.setAddress("Av América - PR");
		person.setGender("Male");
		return person ;
	}

}
